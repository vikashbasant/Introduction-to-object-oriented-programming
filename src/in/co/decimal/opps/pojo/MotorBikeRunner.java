package in.co.decimal.opps.pojo;


public class MotorBikeRunner {
	public static void main(String[] args) {
		// Each Object will have "state" and "behavior"
		MotorBike ducatiBike = new MotorBike(100);
		MotorBike hondaBike = new MotorBike(200);

		ducatiBike.start();
		hondaBike.start();

		ducatiBike.setSpeed(200);

		// here we want to increase the speed of ducati by 100:
//		ducatiBike.setSpeed(ducatiBike.getSpeed() + 100);
		ducatiBike.increaseSpeed(100);
		ducatiBike.decreaseSpeed(150);

		System.out.println(ducatiBike.getSpeed());

		hondaBike.setSpeed(100);

		// here we want to increase the speed of honda by 100:
//		hondaBike.setSpeed(hondaBike.getSpeed() + 100);
		hondaBike.increaseSpeed(100);
		hondaBike.decreaseSpeed(250);
		System.out.println(hondaBike.getSpeed());

	}
}
