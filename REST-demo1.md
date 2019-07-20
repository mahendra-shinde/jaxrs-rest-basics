## REST using Jersey demo-1

1. Visit Jersey download page
    https://jersey.github.io/download.html

2.  Download Jersey 1.19.1 ZIP Bundle

3.  Extract the contents of ZIP into c:\jersey

4.  Create new Java Project (JDK 1.8)
    Project Name : RestService

5.  Add External Jars from c:\jersey\lib (All JAR files)

    Project properties > Java Build Path > Library > Add External Jars

    All the Jars should be visible under "reference libraries"    

6.  Create a Rest Resource (REST uses term "resource" not "service" )

    ```java
    @Path("calc")
    public class Calculator {

    @GET
    public String hello() {
            return "Hello World";
        }
    }
    ```

7.  Create a main class to publish the Rest Resource / Service

    ```java
    public class Main {

	public static void main(String[] args) {
		//Define package name that contains all REST Resources
		ResourceConfig rc = new PackagesResourceConfig("com.mahendra");
		try {
			//Launch an HTTP Server at port 4000
			HttpServer server = HttpServerFactory.create("http://localhost:4000/", rc);
			server.start();
		} catch (IllegalArgumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            }
        }
    }

    ```

8.  Run application as "Java Application" and test following URL with browser:
    
    http://localhost:4000/calc

NOTE: Fix Library reference restriction error:

1. Verify if eclipse is using JDK instead of JRE
        
    Window Menu > Preferences > type "JRE"
    Check if "JDK" is set as Defualt

    if NO then:

    Click *Add* button > Select *Standard VM* > click *Next*

    Click on *Directory* button > Select path _C:\Program Files\Java_

    Select JDK1.8 and Click *Select Folder* button

    Goto *Project Properties* > Java Build Path > Libraries > JRE System

    Click Select *JRE System Library* > Click *Edit* button.

    Select _third option_ which is *Workspace Default* > Finish > Apply & Close