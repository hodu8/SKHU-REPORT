
public class emp {
	private int sal;

	public emp(int sal) {
		this.sal = sal;
	}

	public int inco() {
		return sal;
	}
}

class maa extends emp {
	private int bouns;

	public maa(int sal, int bo) {
		super(sal);
		bouns = bo;
	}

	@Override
	public int inco() {
		return super.inco() + this.bouns;
	}

}