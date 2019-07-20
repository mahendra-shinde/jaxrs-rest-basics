## RestService using Web Project

1. Create new Dynamic Web Project
     Name:      RestService2
     Runtime:   Tomcat

2. Copy all Jersey JAR (from File Explorer) into
    WEB-INF/lib folder

3. Create a new Java class *com.mahendra.app.MyApplication*

    ```Java
    // 	Resulting URL: 
    //     http://localhost:8080/RestService2/api/
    @ApplicationPath("/api")
    public class MyApplication extends PackagesResourceConfig{
        public MyApplication() {
            // Package which contains all REST resources (Class with @Path annotations)
            super("com.mahendra.resources");
        }
    }
    ```

4.  Create new REST Resource class
        *com.mahendra.resources.HelloService*

    ```java    
    //  Exact URL : http://localhost:8080/RestService2/api/hello 
    @Path("/hello")
    public class HelloService {

        @GET
        public String sayHello() {
            return "Hello World";
        }
    }
    ```
5.  Run Application on Server, try URL
        
    http://localhost:8080/RestService2/api/hello