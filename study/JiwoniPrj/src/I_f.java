
public class I_f {

	public static void main(String[] args) {
		int a = 101;

		if (a < 100) {
			System.out.println("100보다 작군요... ");
			System.out.println("100보다 작군요22222 "); // if문 영향 안받는다
		}
		
		if (a >= 100)
			System.out.println(" 난 무조건 실행된다");

	}
}
