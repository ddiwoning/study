import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		int i=0;

		System.out.printf("1번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();
		System.out.printf("2번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();
		System.out.printf("3번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();
		System.out.printf("4번째 숫자를 입력하세요 : ");
		aa[i++] = s.nextInt();

		hap = aa[0] + aa[1] + aa[2] + aa[3];

		System.out.println("합계 ==> " + hap);

		for (int j = 0; j < aa.length; j++) { // 배열의 크기인 4라는 값을 리턴해준다
			System.out.println("aa[" + j + "] : " + aa[j]);
		}

	}

}
