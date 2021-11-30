package oopIntro;

public class ProductManager { 
    
    public void addToChart(Product product) { 
        System.out.println("Product added to chart" + product.name);
    }
    
    public void removeFromChart(){ 
        System.out.println("Product removed from chart");
    }
}
