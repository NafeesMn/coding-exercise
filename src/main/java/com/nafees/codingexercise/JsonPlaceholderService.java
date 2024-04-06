package com.nafees.codingexercise;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

// This is a service class to handle interactions with JSONPlaceholder API
// This class will use RestTemplate to make HTTP Request to JSONPlaceholder API or to consume the API
@Service
public class JsonPlaceholderService {
    
    @Value("${jsonplaceholder.api.url}")
    private String jsonPlaceholderUrl;

    private RestTemplate restTemplate;

    public JsonPlaceholderService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String getPosts(){
        return restTemplate.getForObject(jsonPlaceholderUrl + "/posts", String.class);
    }

    public String getPostsWithLength(){
        NewPost[] newposts = restTemplate.getForObject(jsonPlaceholderUrl + "/posts", NewPost[].class);
        ObjectMapper objectMapper = new ObjectMapper();
        for(int i = 0; i < newposts.length; i++){
            newposts[i] = new NewPost(newposts[i].userId(), newposts[i].id(), newposts[i].title(), newposts[i].body(), CodingexerciseApplication.findTitleLength(newposts[i]));
        }
        try {
            return objectMapper.writeValueAsString(newposts);
        } catch (JsonProcessingException e) {
            return "Error occured while converting to JSON";
        }
    }

    public String getLongestTitle(){
        NewPost[] posts = restTemplate.getForObject(jsonPlaceholderUrl + "/posts", NewPost[].class);
        NewPost postWithLongestTitle = CodingexerciseApplication.findPostWithLongestTitle(posts);
        return postWithLongestTitle.toString();
    }

}
