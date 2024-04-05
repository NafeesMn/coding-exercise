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

**Output Screenshots** <br/>
1. Display all posts
![displayAllPosts](https://github.com/NafeesMn/coding-exercise/assets/145410311/0cd40106-975f-4584-86d4-d3ce4743fa8d)

2. Display title length for all posts
![displayAllTitleLength](https://github.com/NafeesMn/coding-exercise/assets/145410311/9b916dc4-fe35-4f11-93ff-f56964318840)

3. Display longest post title
![findLongestTitle](https://github.com/NafeesMn/coding-exercise/assets/145410311/0c877ba2-a284-40d8-834c-86f05b268274)


