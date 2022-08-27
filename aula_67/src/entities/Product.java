package entities;

public class Product {
	
	private String name;
	private double price;
	public int quantity;
	
	public Product() {
	}
	
	public Product(String name , double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price*quantity;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name 
				+", $ "
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());

	}
}
