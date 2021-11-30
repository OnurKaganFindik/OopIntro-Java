package oopIntro;

public class Product {

	public Product() { // default constructor
		System.out.println("Product constructor");
	};

	public Product( int id ,String name, double unitPrice, String detail) { // parameterized constructor
		System.out.println("Product constructor with parameters");
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice;
	String detail;
	

}
