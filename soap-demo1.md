SOAP Service Demo (Introductory Demo)

1. New Project (Use JDK 1.8)
2. Create new Interface 

    ```java    
    @WebService
    public interface Calculator {

        public double add(int n1, int n2);
        public double sub(int n1, int n2);
    }
    ```
3.  Create Implementation class
    ```java
    @WebService(name="calc",endpointInterface="com.mahendra.Calculator")
    public class CalculatorImpl implements Calculator {

    @Override
    public double add(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1+n2;
    }

    @Override
    public double sub(int n1, int n2) {
            // TODO Auto-generated method stub
            return n1-n2;
    }
        
    }
    ```

4.  Now, Create Main class

    ```java
    public class Main {

	public static void main(String[] args) {
		Calculator calc = new CalculatorImpl();
		Endpoint.publish("http://localhost:5000/calc", calc);
		System.out.println("Service published!");
        }

    }
    ```

5.  Run the Main class, open web browser and try URL:

    http://localhost:5000/calc?wsdl