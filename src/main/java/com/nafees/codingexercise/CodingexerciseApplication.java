package com.nafees.codingexercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CodingexerciseApplication {

	// Log message into console
	private static final Logger log = LoggerFactory.getLogger(CodingexerciseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CodingexerciseApplication.class, args);		
	}

	// RestTemplate for making HTTP requests and work with RESTful API
	// Bean is an object that Spring knows 
	@Bean
	public RestTemplate restTemplate (RestTemplateBuilder builder){
		return builder.build();
	}

	@Bean
	@Profile("!test")
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			NewPost[] posts = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", NewPost[].class);

			// Find the post with the longest title
			NewPost postWithLongestTitle = findPostWithLongestTitle(posts);

			// Display the title and body of the longest title
			if (postWithLongestTitle != null) {
				log.info("POST WITH LONGEST TITLE:");
				log.info("===========================================================");
				log.info("Title: " + postWithLongestTitle.title());
				log.info("Body: " + postWithLongestTitle.body());
				log.info("Longest Title length: " + postWithLongestTitle.title().length());
				log.info("===========================================================");
			}
			else{
				log.error("No posts found");
			}
		};
	}

	public static NewPost findPostWithLongestTitle(NewPost[] posts) {
		if (posts == null || posts.length == 0)
			return null;
		NewPost postWithLongestTitle = posts[0];
		for(NewPost post : posts){
			if(post.title().length() > postWithLongestTitle.title().length())
				postWithLongestTitle = post;
		}
		return postWithLongestTitle;
	}

	public static int findTitleLength(NewPost post){
		return post.title().length();
	}
}
