# Spring 
Spring Boot is basically an extension of the Spring framework which eliminated the boilerplate configurations required for setting up a Spring application.It provides an easier
and faster way to set up, configure, and run both simple and web-based applications.

The primary feature of Spring Boot is __Auto configuration__. It automatically configures the classes based on the requirement.
It helps to create a __Stand-alone__ application with less configuration.
Spring Boot offers embedded server such as Jetty and Tomcat, etc.

## __Generating a Project__
Supported Interface
It supports __IDE STS, IntelliJ IDEA Ultimate, NetBeans, Eclipse.__
__Project:__ It defines the kind of project. We can create either Maven Project or Gradle Project.
We will create a Maven Project.

__MAVEN:__
Maven is “yaddish” [German language] word, Its meaning is “Accumulator of knowledge”.

__Maven will do:-__
* Maven will provide default project structure.
* Download require dependencies [jar files]
* Compiles source code
* Packing project as .jar file, .war file & .ear file
* Start server
* Deploy project in server
* Perform Unit testing
* Prepared test report
* Prepared documents

Maven application pom.xml files is able to provide following configuration.
* Name: It is the same as Artifact.
* Description: In the description field, we can write a description of the project.
* Package Name: It is also similar to the Group name.
* Packaging: We can select the packing of the project. We can choose either Jar or War.
* Java: We can select the JVM version which we want to use.

# Spring Boot Annotation
* __@SpringBootApplication__
  @SpringBootApplication annotation in our Application or Main class.
  The @SpringBootApplication actually a combination of three annotations:
  1) @Configuration which is used in Java-based configuration on Spring framework.
  2) @EnableAutoConfiguration does just that it provides each of the representing class with the Automatic Configuration capability.
  3) @ComponentScan will at initialization scan all the beans and package declarations.
  
* __@Autowired__
To wire the application parts together, use the @Autowired on the fields, constructors, or methods in a component.

* __Qualifier__
If you have multiple beans that can be wired into the field marked with @Autowired, use @Qualifier to filter which beans should be used there.

* __@Controller__
@Controller marks the class as a web controller, capable of handling the HTTP requests. Spring will look at the methods of the class marked with the @Controller annotation and establish the routing table to know which methods serve which endpoints.

* __@ResponseBody__
The @ResponseBody is a utility annotation that makes Spring bind a method's return value to the HTTP response body.

* __@RestController__
@RestController simply returns the object and object data is directly written into HTTP
response as JSON or XML.

* __@RequestMapping(method = RequestMethod.GET, value = "/path")__
@RequestMapping annotation is used for mapping web requests to particular handler classes or handler methods.
The @RequestMapping(method = RequestMethod.GET, value ="/path") annotation specifies a method in the controller that should be responsible for serving the HTTP request to the given path.
 Spring will work the implementation details of how it's done. You simply specify the path value on the annotation and Spring will route the requests into the correct action methods.
