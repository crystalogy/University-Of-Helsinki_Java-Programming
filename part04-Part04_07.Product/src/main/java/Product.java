/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Crystal
 */
public class Product {
    private String name;
    private double price;
    private double quantity;
    
    public Product (String initialName, double initialPrice, int initialQuantity){ // created the constructor
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.println(name + ", price " + price + " , " + quantity );
    }
} 

