
public class Car {

	protected double speed;
	protected int maxspeed;
	private double acceleration;
	private double distanceNext, speedNext;
	protected int id;

	private float[] x = new float[5];
	private float[] y = new float[5];

	public boolean collision(Car currentcar) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean collison(Car target) {
		return (this.getDistance(x[0], y[0], target.x[0], target.y[0]) < 26);
	}

	public static double getDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
}
