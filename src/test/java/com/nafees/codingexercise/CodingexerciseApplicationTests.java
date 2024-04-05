package com.nafees.codingexercise;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodingexerciseApplicationTests {

	@Test
	void testFindPostWithLongestTitle() {
		// Create dummy data
		Post post1 = new Post(1L, 1L, "Title 1", "Body 1", 11);
        Post post2 = new Post(2L, 2L, "Title 22", "Body 2", 17);
        Post post3 = new Post(3L, 3L, "Title 333", "Body 3", 29);
        Post[] posts = { post1, post2, post3 };

		// Call findPostWithLongestTitle()
		Post postWithLongestTitle = CodingexerciseApplication.findPostWithLongestTitle(posts);

		// Assert
		assertEquals(post3.titleLength(), postWithLongestTitle.titleLength());
	}

	@Test
	void testFindTitleLength(){
		// Create sample post
		Post post = new Post(1L, 1L, "Godzilla in the City!", "Godzilla has invaded the city. Safe yourself!", 21);

		// Call findTitleLength()
		int titleLength = CodingexerciseApplication.findTitleLength(post);

		// Assert
		assertEquals(21, titleLength);
	}

	@Test
	void testDisplayAllPosts(){
		// Create dummy data
		Post post = new Post(1L, 1L, "Title 1", "Body 1", 7);

		// Call displayAllPosts()
		String result = CodingexerciseApplication.displayAllPosts(post);

		// Expected result output
		String expected = "Post 1\nUser ID: 1\nTitle: Title 1\nBody: Body 1";

		// Verify that the output is the same as expected
		assertEquals(expected, result);
	}
	
}
