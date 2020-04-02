package Java_Core_2;

public class Rectangle {
	private int length;
	private int width;

	Rectangle() {
		length = 6;
		width = 5;
	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	int S() {
		return width * length;
	}
	
	int P() {
		return (width + length)*2;
	}
}