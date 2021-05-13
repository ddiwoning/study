import java.util.Scanner;
 
public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.printf("첫 번째로 더할 수 입력 : ");
			a = s.nextInt();
			System.out.printf("두 번째 수 더할 수 입력 : ");
			b = s.nextInt();

			System.out.println(a + "+" + b + "=" + (a + b));

			// 한계가 10보다 크면 나가기
			if ((a + b) > 10) {
				break;

			}
		}
	}

}
