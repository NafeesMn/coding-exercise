# Coding Exercise: Spring Boot REST API
A Java application built using the Spring Boot framework. It serves as a REST API that interacts with the JSONPlaceholder API, retrieving and processing data about posts. <br/><br/> 
The application fetches a list of posts from the JSONPlaceholder API, analyzes them, and provides various functionalities, including displaying all posts, finding the post with the longest title, and modifying the JSON response format to include the length of each post's title.<br/>  
Additionally, the application is equipped with unit tests to ensure the reliability and correctness of its features. Overall, the Coding Exercise demonstrates the implementation of a Spring Boot REST API for data retrieval and manipulation.

## **Prerequisite** <br/>
Java JDK (version 17 or higher)
Maven (version 3.2.4 or higher)

## **Build Instructions** <br/>
1.  Clone the repository
2.  Navigate to the project directory
3.  Build and Run the project using:

     ```
     ./mvnw spring-boot:run
     ```
     Alternatively you can use

     ```
     ./mvnw clean package
     ```
## **After the server has started, you may access the following endpoints: ** <br/>
1. To get all posts:
     ```
     http://localhost:8080/posts
     ```
2. To get the post with the longest title:
     ```
     http://localhost:8080/longestTitle
     ```
3. To get all post with a new field titleLength:
     ```
     http://localhost:8080/postsTitleLength
     ```


**Output Screenshots** <br/>
1. Display all posts
   
![displayAllPosts](https://github.com/NafeesMn/coding-exercise/assets/145410311/f9e10b1a-77e8-4fe6-88a9-00c784d19850)

3. Display the post with the longest title
   
![findLongestTitle](https://github.com/NafeesMn/coding-exercise/assets/145410311/0c877ba2-a284-40d8-834c-86f05b268274)

4. Display all post with a new field titleLength
   
![displayAllTitleLength](https://github.com/NafeesMn/coding-exercise/assets/145410311/9b5b8a22-3ae3-480a-b6af-72443cb1b4d9)

5. Unit test result for the API Controller

![testApiControllerTest](https://github.com/NafeesMn/coding-exercise/assets/145410311/37a5c960-10de-4c74-9b0c-2fc89f841ad1)

6. Unit test result for the main class
![testMainClass](https://github.com/NafeesMn/coding-exercise/assets/145410311/02ae3aef-ab3e-4ce0-8ea5-b3baa0dffca9)



