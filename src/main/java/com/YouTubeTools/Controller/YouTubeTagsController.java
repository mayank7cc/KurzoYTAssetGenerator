package com.YouTubeTools.Controller;


import com.YouTubeTools.Model.SearchVideo;
import com.YouTubeTools.Service.YoutubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/youtube")
public class YouTubeTagsController {

    @Autowired
    private YoutubeService youtubeService;

    @Value("{youtube.api.key}")
    private String apikey;

    private boolean isApiKeyConfigured(){
        return apikey!=null && !apikey.isEmpty();
    }

    @PostMapping("/search")
    public String VideoTags(@RequestParam("VideoTitle") String VideoTitle , Model model){

        if(!isApiKeyConfigured()){
            model.addAttribute("error","Api Key is not Configured!!!");
            return "home";
        }

        if(VideoTitle == null || VideoTitle.isEmpty()){
            model.addAttribute("error","Title Required!!!");
            return "home";
        }
        try{
            SearchVideo result = youtubeService.searchVideos(VideoTitle);
            model.addAttribute("primaryVideo", result.getPrimaryVideo());
            model.addAttribute("relatedVideos", result.getRelatedVideos());
            return "home";
        }catch(Exception e){
            model.addAttribute("error",e.getMessage());
            return "home";
        }
    }
}
