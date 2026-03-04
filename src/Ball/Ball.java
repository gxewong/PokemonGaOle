package Ball;

public class Ball {
	//attributes
	protected String name;
	protected String color;
	protected float catchRate;
	
	//constructor
	public Ball(String name, String color, float catchRate) {
		this.name = name;
		this.color = color;
		this.catchRate = catchRate;
	}

	//setter/getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getCatchRate() {
		return catchRate;
	}

	public void setCatchRate(float catchRate) {
		this.catchRate = catchRate;
	}


	//toString
	@Override
	public String toString() {
		return "Ball: name = " + name + ", color = " + color + ", catchRate = " + catchRate;
	}
}