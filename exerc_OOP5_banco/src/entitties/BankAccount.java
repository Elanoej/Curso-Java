package entitties;

public class BankAccount {
	private int number;
	private String name;
	private double balance;
	
	public BankAccount() {
	}
	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
	}
	public BankAccount(int number, String name, double initialDeposit) {
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void deposit(double value) {
		balance += value;
	}
	public void withdraw(double value) {
		balance -= value+5;
	}
	public String toString() {
		return "Account " + number +',' + " Holder: "+name+", "+ "Balance: $ "+String.format("%.2f", balance);		
	}
}
