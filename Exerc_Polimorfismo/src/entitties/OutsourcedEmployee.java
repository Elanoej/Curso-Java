package entitties;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharger;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharger) {
		super(name, hours, valuePerHour);
		this.additionalCharger = additionalCharger;
	}
	
	@Override
	public Double payment() {
		return super.payment() + (1.1*additionalCharger);
	}
	public String toString() {
		return name + " - $ " + String.format("%.2f", payment());
	}
}
