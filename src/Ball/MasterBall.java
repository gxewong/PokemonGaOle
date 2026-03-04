package Ball;

public class MasterBall extends Ball {
	public MasterBall() {
		super("Master Ball", "Purple/White with Pink Accents", 0.9f);
	}
	
	@Override
	public String toString() {
		return "Master Ball!";
	}
}