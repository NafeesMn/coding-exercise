package com.nafees.codingexercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodingexerciseApplicationTests {

	@Test
	void testFindPostWithLongestTitle() {
		// Create dummy data
		NewPost post1 = new NewPost(1L, 1L, "Title 1", "Body 1", 11);
        NewPost post2 = new NewPost(2L, 2L, "Title 22", "Body 2", 17);
        NewPost post3 = new NewPost(3L, 3L, "Title 333", "Body 3", 29);
        NewPost[] posts = { post1, post2, post3 };

		// Call findPostWithLongestTitle()
		NewPost postWithLongestTitle = CodingexerciseApplication.findPostWithLongestTitle(posts);

		// Assert
		assertEquals(post3.titleLength(), postWithLongestTitle.titleLength());
	}

	@Test
	void testFindTitleLength(){
		// Create sample post
		NewPost post = new NewPost(1L, 1L, "Godzilla in the City!", "Godzilla has invaded the city. Safe yourself!", 21);

		// Call findTitleLength()
		int titleLength = CodingexerciseApplication.findTitleLength(post);

		// Assert
		assertEquals(21, titleLength);
	}
	
}
