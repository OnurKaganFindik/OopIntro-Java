package oopIntro;

//Don't repeat yourself (DRY) 

//SOLID principles 
//S - Single responsibility principle
//O - Open/closed principle
//L - Liskov substitution principle
//I - Interface segregation principle
//D - Dependency inversion principle

public class Product {

	public Product() { // default constructor 
		System.out.println("Product constructor");
	};

	public Product( int id ,String name, double unitPrice, String detail) { // parameterized constructor 
		this(); // call default constructor of Product class 
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		System.out.println("Product constructor with parameters");
	};

	int id;
	String name;
	double unitPrice;
	String detail;
	

}
