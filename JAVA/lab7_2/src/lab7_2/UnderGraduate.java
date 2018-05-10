package lab7_2;

public class UnderGraduate extends Student {
	public UnderGraduate(int id, double score) {
		super(id, score);
	}
	@Override
	public boolean warning() {
		return getScore() > 1.5;
	}

}
