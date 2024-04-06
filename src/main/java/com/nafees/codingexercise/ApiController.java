package com.nafees.codingexercise;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController // Tells Spring that this class will handle HTTP requests and directly return response data (JSONs)
class ApiController {

    private JsonPlaceholderService jsonPlaceholderService;

    public ApiController(JsonPlaceholderService jsonPlaceholderService){
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    // Get all posts
    @GetMapping("/posts")
    public String getPosts() {
        return jsonPlaceholderService.getPosts();
    }

    // Get post with longest title
    @GetMapping("/longestTitle")
    public String getLongestTitle() {
        return jsonPlaceholderService.getLongestTitle();
    }
    
    // Get all posts with a new field titleLength
    @GetMapping("/postsTitleLength")
    public String getPostsWithLength() {
        return jsonPlaceholderService.getPostsWithLength();
    }
    
}