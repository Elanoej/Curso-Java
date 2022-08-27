package entitties;

public class Student {
	private String name;
	private double nota1;
	private double nota2;

	public Student() {
	}

	public Student(String name, double nota1, double nota2) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota2() {
		return nota2;
	}

	public double media() {
		return (nota1 + nota2) / 2;
	}
}
