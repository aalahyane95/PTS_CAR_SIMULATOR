import java.util.Iterator;
import java.util.Vector;

public class CarContainer {

	int sX, sY, endX, endY;
	double dy, dx, length;
	int id;

	Vector cars = new Vector();

	public CarContainer(int id, int sX, int sY, int endX, int endY) {

		this.sX = sX;
		this.sY = sY;
		this.endX = endX;
		this.endY = endY;
		this.id = id;

	}

	public double getdy() {
		return dy;
	}

	public double getdx() {
		return dx;
	}

	public int getsX() {
		return sX;
	}

	public int getsY() {
		return sY;
	}

	public int getendX() {
		return endX;
	}

	public int getendY() {
		return endY;
	}

	public int getID() {
		return id;
	}

	public void addCar(Car car) {
		cars.addElement(car);
	}

	public void removeCar(Car car) {
		cars.removeElement(car);
	}

	public boolean hasCars() {
		return (cars.size() != 0);
	}

	public boolean crash(Car currentcar) {

		while (cars.iterator().hasNext()) {

			final Car tempcar = (Car) cars.iterator().next();
			if ((tempcar.collision(currentcar)) && (tempcar != currentcar)) {
				return true;
			}
		}
		return false;
	}

	public int nbStoppedCars() {
		int sum = 0;

		while (cars.iterator().hasNext()) {

			final Car tempcar = (Car) cars.iterator().next();
			if ((int) tempcar.speed == 0)
				sum++;

		}

		return sum;
	}
}
