Kurzo YouTube Tools:
Kurzo YouTube Tools is a SaaS-style web application built using Java Spring Boot and integrated with the YouTube Data API. 
The project is designed to help YouTube content creators optimize their workflow by generating SEO-optimized tags, retrieving complete video metadata, 
and downloading high-resolution thumbnails through a single unified interface.

Features:
SEO Tag Generator,
The application allows users to input a YouTube video title and generates a list of relevant SEO tags by analyzing related videos,
This helps creators improve discoverability and search ranking on YouTube.

Video Metadata Retrieval:
Users can fetch complete video information including title, channel name, publish date, description, and available tags using the YouTube Data API.

Thumbnail Downloader:
The application enables users to retrieve and download the highest-resolution YouTube thumbnail by entering a video URL or ID.

Technology Stack:
Backend: Java Spring Boot,
Frontend: Thymeleaf with Tailwind CSS,
API Integration: YouTube Data API v3,
Build Tool: Maven.

How the Project Works:
The application uses the YouTube Data API to fetch video-related data based on user input.
When a video title or URL is submitted, the backend processes the request, queries the API, extracts metadata and tags, and returns the results to the frontend. 
Thumbnail URLs are dynamically constructed and served for download. The frontend renders all results using server-side Thymeleaf templates with a modern responsive UI.

Project Structure:

YouTubeTools/
├── .idea/
├── .mvn/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── YouTubeTools/
│   │   │           ├── Config/
│   │   │           │   └── WebClientConfig.java
│   │   │           │
│   │   │           ├── Controller/
│   │   │           │   ├── PageController.java
│   │   │           │   ├── ThumbnailController.java
│   │   │           │   ├── YouTubeTagsController.java
│   │   │           │   └── YouTubeVideoController.java
│   │   │           │
│   │   │           ├── Model/
│   │   │           │   ├── SearchVideo.java
│   │   │           │   ├── Video.java
│   │   │           │   └── VideoDetails.java
│   │   │           │
│   │   │           ├── Service/
│   │   │           │   ├── ThumbnailService.java
│   │   │           │   └── YoutubeService.java
│   │   │           │
│   │   │           └── YouTubeToolsApplication.java
│   │   │
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       │   ├── fragments/
│   │       │   │   └── navbar.html
│   │       │   ├── home.html
│   │       │   ├── thumbnails.html
│   │       │   └── video-details.html
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
└── pom.xml

Open the application in a browser at:
http://localhost:8080

Use Cases:
This project is suitable for YouTube creators, SEO specialists, and developers who want to analyze and optimize YouTube video metadata efficiently.

Contributions:
Contributions are welcome through pull requests and issues for feature enhancements, performance improvements, or UI upgrades.
