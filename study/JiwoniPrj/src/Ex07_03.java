import java.util.Scanner;
 
public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.printf("ù ��°�� ���� �� �Է� : ");
			a = s.nextInt();
			System.out.printf("�� ��° �� ���� �� �Է� : ");
			b = s.nextInt();

			System.out.println(a + "+" + b + "=" + (a + b));

			// �Ѱ谡 10���� ũ�� ������
			if ((a + b) > 10) {
				break;

			}
		}
	}

}
