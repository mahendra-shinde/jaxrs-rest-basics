## Rest Demo with JSON Content Type

1. Create new Dynamic Web Project 
    Name:   ProductCatalog
    Runtime: Tomcat 8

2.  Copy all Jersey JARS into WEB-INF/lib folder

3.  Create an Application class **com.mahendra.app.MyApplication**

    ```java
    @ApplicationPath("/api")
    public class MyApplication extends PackagesResourceConfig {
        public MyApplication() {
            super("com.mahendra.resources");
        }
    }
    ```
4.  Create an Entity class **com.mahendra.entities.Product**

    ```java
    public class Product {
	private String name;
	private String description;
	private double price;
    }
    ```

5.  Add Getters & Setters for all properties in Product class.

6.  Add Constructors: 1- Empty, 2-Parameterized

7.  Create a DAO Class **com.mahendra.dao.ProductDAO**

    ```java
    public class ProductDAO {
	private Map<Integer,Product> products = new HashMap<>();
	
	public ProductDAO() {
		products.put(101,new Product("Iron Man Toy-Set", "New Iron Man Collection (Inifinity War)",2300));
		products.put(102,new Product("Captain America Shield", "A Shield made in plastic for age group below 13",200));
	}
	
	public Product findById(int id) {
		return products.get(id);
	}
	
	public Map<Integer,Product> getAll(){
		return products;
        }
    }

    ```
8.  Create new Rest Service **com.mahendra.resources.ProductService**

    ```java
    @Path("products")
    public class ProductService {

	private ProductDAO dao = new ProductDAO();
	//    http://localhost:8080/ProductCatalog/api/products
	@GET @Produces("application/json")
	public Map findAll() {
		return dao.getAll();
	}
	
	//   http://localhost:8080/ProductCatalog/api/products/by?id=101
	@GET  @Path("by") @Produces("application/json")
	public Product find(@QueryParam("id") int id) {
		return dao.findById(id);
        }
    }
    ```

9.  Run Application on Server, and visit following URLs

    > http://localhost:8080/ProductCatalog/api/products/by?id=101

    > http://localhost:8080/ProductCatalog/api/products