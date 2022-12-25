package in.co.decimal.opps.pojo;

public class MotorBike {
	// state:
	// instance variable:
	private int speed; // member variable

	// constructor:
	public MotorBike() {
		// here this() function call the parameterized constructor:
		this(5);
	}

	// Parameterized constructor:
	public MotorBike(int speed) {
		this.speed = speed;
	}

	// method: getter and setter:
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) { // local variable
//		System.out.println(speed); // here this will print local variable
//		System.out.println(this.speed); // here this will print default value of speed is 0.

		if (speed > 0) {
			this.speed = speed;
		}

//		System.out.println(this.speed); // here this will print after modification.
	}

	// behaviour:
	void start() {
		System.out.println("Bike Started");
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
//		if (howMuch > this.speed) {
//			this.speed = 0;
//		} else {
//			this.speed -= howMuch;
//		}

		// another way:
		setSpeed(this.speed - howMuch);

	}

}
