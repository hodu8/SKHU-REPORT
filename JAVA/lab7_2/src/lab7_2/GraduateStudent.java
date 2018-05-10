package lab7_2;

public class GraduateStudent extends Student {
	public GraduateStudent (int id, double score){
		super(id, score);
	}
	@Override
	public boolean warning() {
		return getScore() < 3.0 && getScore() >= 1.5;
	}
}
