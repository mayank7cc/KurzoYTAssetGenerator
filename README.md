https://github.com/user-attachments/assets/0dbb2d59-9260-4b4d-b8bb-46f16ac67f43

# Kurzo YouTube Tools

Kurzo YouTube Tools is a SaaS-style web application built using Java Spring Boot and integrated with the YouTube Data API v3.  
The project is designed to help YouTube content creators optimize their workflow by generating SEO-optimized tags, retrieving complete video metadata, and downloading high-resolution thumbnails through a single unified interface.

---

## Features

### SEO Tag Generator
The application allows users to input a YouTube video title and generates a list of relevant SEO tags by analyzing related videos.  
This helps creators improve discoverability and search ranking on YouTube.

### Video Metadata Retrieval
Users can fetch complete video information including:

- Title  
- Channel name  
- Publish date  
- Description  
- Available tags  

All metadata is retrieved using the YouTube Data API.

### Thumbnail Downloader
The application enables users to retrieve and download the highest-resolution YouTube thumbnail by entering a video URL or video ID.

---

## Technology Stack

| Layer | Technology |
|------|------------|
| Backend | Java Spring Boot |
| Frontend | Thymeleaf |
| Styling | Tailwind CSS |
| API Integration | YouTube Data API v3 |
| Build Tool | Maven |

---

## How the Project Works

The application uses the YouTube Data API to fetch video-related data based on user input.

1. The user submits a YouTube video title or URL.
2. The backend processes the request using Spring Boot controllers and services.
3. The application queries the YouTube Data API.
4. Metadata and tags are extracted from the response.
5. Thumbnail URLs are generated dynamically.
6. The frontend renders the results using Thymeleaf templates.

---

## Project Structure

<img width="1024" height="1536" alt="Project Structure" src="https://github.com/user-attachments/assets/f65025bf-8728-41dc-935f-fb2095829cb2" />

---

## Running the Project Locally

### Clone the repository

```bash
git clone https://github.com/mayank7cc/KurzoYTAssetGenerator.git
cd KurzoYTAssetGenerator
```

### Build the project

```bash
mvn clean install
```

### Run the application

```bash
mvn spring-boot:run
```

Open the application in a browser:

```
http://localhost:8080
```

---

## Deployment

Live deployment is available at:

```
https://kurzoytassetgenerator.onrender.com/

```

---

## Use Cases

This project is useful for:

- YouTube creators who want to generate SEO tags for better discoverability
- SEO specialists analyzing video metadata
- Developers exploring YouTube Data API integration

---

## Contributions

Contributions are welcome.

If you would like to improve this project:

1. Fork the repository  
2. Create a new branch  
3. Commit your changes  
4. Submit a pull request
