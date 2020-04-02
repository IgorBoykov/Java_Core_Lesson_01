package Java_Core_2;

public class Circle {

	private double radius;
	private double diameter;

	Circle(double radius, double diametr) {
		this.radius = radius;
		this.diameter = diametr;
	}

	public double pl() {
		return Math.PI * diameter * diameter / 4;
	}

	public double dovzh() {
		return 2 * Math.PI * radius;
	}

}
