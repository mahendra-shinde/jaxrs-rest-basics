SOAP Service Consumer

1. Create new Java project (JDK 1.8)
	project name: TestClient
2. Create a package "com.mahendra" (Must match with project "TestService")
3. Copy Calculator.java from First/Earlier project
    and paste in new package "com.mahendra"
4. Create new Main class:

    ```java
    public class Main {
	public static void main(String[] args) {
		try {
			Service service = Service.create(new URL("http://localhost:5000/calc"), new QName("http://mahendra.com/", "CalculatorImplService"));
			Calculator calc = service.getPort(Calculator.class);
			double ans = calc.add(100, 12);
			System.out.println("Answer is " + ans);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    }
    ```