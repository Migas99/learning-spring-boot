# Spring Boot Dependency Injection example Application

***Status: Complete***

# Context and Details

Example Application using Spring Boot.

Built in Java 11 using Maven.

Dependencies:
- None

Context:
- Learn the different ways to inject dependencies and know which ones are best practice
- What are profiles and how can we use them
- Bean LifeCycle methods

Details:
- Implemented three ways to inject dependencies
- One using the properties
- One using the Setters
- One from the constructor method
- Best practice is to always instanciate from the constructor method
- @Autowired annotation is used to tell Spring when we want to inject something (by default, if using the constructor method there's no need for that)
- @Qualifier decides which type of instance of one bean is injected
- @Primary sets an certain instance of an bean as default depdency injection when @Qualifier doesn't specify
- @Profile defines in which profiles the services are called
