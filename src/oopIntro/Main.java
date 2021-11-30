package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1= new Product(1,"Lenova V14",15000,"16 GB Ram"); //object creation of class Product with parameters 
	
		
		Product product2= new Product(); //object creation of class Product with default parameters
		product2.id=2;
		product2.name="Lenova V15";
		product2.unitPrice=12000;
		product2.detail="16 GB Ram";
		
		Product product3= new Product(); 
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8 GB Ram";
		
		
		
		
		Product[] products= {product1,product2,product3}; //creating an array of Product class and storing it in products variable 
		
		for (Product product : products) {
			
			System.out.println(product.name);
			
		};
		
		
		System.out.println(products.length);

		Category category1= new Category(); //object creation of class Category with default parameters
		category1.id=1;
		category1.name="Laptop";

		Category category2= new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";


		ProductManager productManager= new ProductManager(); //object creation of class ProductManager with default parameters
		productManager.addToChart(product1);
		productManager.addToChart(product2);
		productManager.addToChart(product3);
		
	}

}
