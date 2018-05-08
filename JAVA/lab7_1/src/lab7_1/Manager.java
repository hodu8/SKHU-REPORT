package lab7_1;

public class Manager extends Employee{
	private int bonus;
	public int getBouns(){
		return bonus;
	}
	public void setBonus(int bonus){
		this.bonus = bonus;
	}
	@Override
	public int getTax(){
		return (bonus + getSalary())/10;
	}
}
