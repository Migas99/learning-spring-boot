# Spring Boot Web App

***Status: Complete***

# Context and Details

Example Web App using Spring Boot.

Built in Java 11 using Maven.

Dependencies:
- Spring Web
- Spring Data JPA
- H2 Database
- Thymeleaf

Context:
- This application will have Authors, Books and Publishers
- We will have two endpoints: /authors and /books
- Each endpoint returns and HTML page with a list of authors or books

Details:
- In the Models package are the POJO Objects, in this case, Author, Book and Publisher and their relationships
- At the repositories we define the database methods, which in this case are the default ones
- At the package BootStrap we initialize and create some data
- With the help of H2, we can login in our web browser at http://localhost:PORTNUMBER/h2-console/ and login to see our "database" tables (in memory)
- At the package Controllers, we have defined our endpoints paths and returns, which in this case are http://localhost:PORTNUMBER/authors and http://localhost:PORTNUMBER/books and both return an HTML page with data in it
- With the help of Thymeleaf, we generated an HTML page with data from our database in memory that is returned from our endpoints
