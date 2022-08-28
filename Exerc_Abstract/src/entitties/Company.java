package entitties;

public class Company extends TaxPayer {

	private int numberOfEmployee;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public Double taxesPaid() {
		Double result = 0.0;
		if (numberOfEmployee > 10) {
			result = super.getAnualIncome() * 14 / 100;
		} else {
			result = super.getAnualIncome() * 16 / 100;
		}
		return result;
	}
	
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f", taxesPaid());
	}

}
