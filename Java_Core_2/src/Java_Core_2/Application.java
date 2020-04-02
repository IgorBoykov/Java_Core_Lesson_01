package Java_Core_2;

public class Application {

	public static void main(String[] args) {
	
	//Завдання_1
		Rectangle a = new Rectangle();
		a.setLength(6);
		a.setWidth(5);

		Rectangle b = new Rectangle();
		System.out.println("Площа прямокутника = "+b.S());
		System.out.println("Периметр прямокутника = "+b.P());
		

		//Завдання_2
		Circle i = new Circle(6.5, 4.8);
		System.out.println("Площа Кола = "+i.pl());
		System.out.println("Довжина кола = "+i.dovzh());
	}

}
