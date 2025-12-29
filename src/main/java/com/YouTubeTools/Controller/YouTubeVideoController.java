package com.YouTubeTools.Controller;

import com.YouTubeTools.Model.VideoDetails;
import com.YouTubeTools.Service.ThumbnailService;
import com.YouTubeTools.Service.YoutubeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class YouTubeVideoController {

    private final YoutubeService youTubeService;
    private final ThumbnailService service;

    @GetMapping("/youtube/video-details")
    public String showVideoForm() {
        return "video-details"; // Thymeleaf template name
    }

    @PostMapping("/youtube/video-details")
    public String fetchVideoDetails(
            @RequestParam String videoUrlOrId,
            Model model
    ) {
        String videoId = service.extractVideoId(videoUrlOrId);

        if (videoId == null) {
            model.addAttribute("error", "Invalid YouTube URL or ID.");
            return "video-details";
        }

        VideoDetails details = youTubeService.getVideoDetails(videoId);
        if (details == null) {
            model.addAttribute("error", "Video not found.");
        } else {
            model.addAttribute("videoDetails", details);
        }
        model.addAttribute("videoUrlOrId", videoUrlOrId);
        return "video-details";
    }
}

