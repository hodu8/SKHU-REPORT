package lab7_1;

public class Employee {
	private int salary = 0;
	public int getSalary(){
		return salary;
	}
	public int getTax(){
		return salary/10;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
}