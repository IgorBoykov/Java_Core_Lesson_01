package Java_Core_2;

public class Application {

	public static void main(String[] args) {
	
	//��������_1
		Rectangle a = new Rectangle();
		a.setLength(6);
		a.setWidth(5);

		Rectangle b = new Rectangle();
		System.out.println("����� ������������ = "+b.S());
		System.out.println("�������� ������������ = "+b.P());
		

		//��������_2
		Circle i = new Circle(6.5, 4.8);
		System.out.println("����� ���� = "+i.pl());
		System.out.println("������� ���� = "+i.dovzh());
	}

}
