package entitties;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double taxesPaid() {
		Double result;
		if (super.getAnualIncome() < 20000) {
			result = (super.getAnualIncome() * 15 / 100);
		} else {
			result = (super.getAnualIncome() * 25 / 100);
		}
		if (healthExpenditures > 0) {
			result -= (healthExpenditures / 2);
		}
		return result;
	}

	@Override
	public String toString() {
		return super.getName() + ": $ " + String.format("%.2f", taxesPaid());
	}

}
