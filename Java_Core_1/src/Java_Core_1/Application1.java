package Java_Core_1;

public class Application1 {
	public static void main(String[] args) {

		// Завдання 1
		int a = 1;
		double b = 2.1;
		char c = 'a';
		long d = 1;
		float e = 5.6f;
		byte f = 123;
		boolean g = true;
		short h = -2541;

		System.out.println("Integer a = " + a);
		System.out.println("Double b = " + b);
		System.out.println("Char c = " + c);
		System.out.println("Long d = " + d);
		System.out.println("Float e = " + e);
		System.out.println("Byte f = " + f);
		System.out.println("Boolean g = " + g);
		System.out.println("Boolean h = " + h);
		System.out.println();

		// Завдання 2
		System.out.println("Max Int = " + Integer.MAX_VALUE);
		System.out.println("Min Int = " + Integer.MIN_VALUE);
		System.out.println("Max Double = " + Double.MAX_VALUE);
		System.out.println("Min Double = " + Double.MIN_VALUE);
		System.out.println("Max Character = " + Character.MAX_VALUE);
		System.out.println("Min Character = " + Character.MIN_VALUE);
		System.out.println("Max Long = " + Long.MAX_VALUE);
		System.out.println("Min Long = " + Long.MIN_VALUE);
		System.out.println("Max Float = " + Float.MAX_VALUE);
		System.out.println("Min Float = " + Float.MIN_VALUE);
		System.out.println("Max Byte = " + Byte.MAX_VALUE);
		System.out.println("Min Byte = " + Byte.MIN_VALUE);
		System.out.println("Max Short = " + Short.MAX_VALUE);
		System.out.println("Min Short = " + Short.MIN_VALUE);
		System.out.println("");

		// Завдання 3
		int[] array = { 5, 15, -4, 154, 21, 77, -1, 8, 401, 75 };
		int min = 0, max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}
		System.out.println("Min value = " + min);
		System.out.println("Max value = " + max);
	}
}
