package model.entitties;

public class Invoice {

	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
	}
	
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	public Double getBasicPayment() {
		return basicPayment;
	}
	
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public Double getTax() {
		return tax;
	}
	
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Basic payment: " + String.format("%.2f", basicPayment) + "\nTax: " + String.format("%.2f", tax) + "\n");
		sb.append("Total payment: " + String.format("%.2f", getTotalPayment()));
		return sb.toString();
	}
}
