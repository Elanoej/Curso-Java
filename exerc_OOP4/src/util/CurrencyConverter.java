package util;

public class CurrencyConverter {
	public double dollarPrice;
	public double dollarBuying;
	
	public double paidReais() {
		return dollarBuying*dollarPrice+(dollarBuying*dollarPrice*6/100);
	}
}
