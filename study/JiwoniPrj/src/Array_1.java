import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		int i=0;

		System.out.printf("1��° ���ڸ� �Է��ϼ��� : ");
		aa[i++] = s.nextInt();
		System.out.printf("2��° ���ڸ� �Է��ϼ��� : ");
		aa[i++] = s.nextInt();
		System.out.printf("3��° ���ڸ� �Է��ϼ��� : ");
		aa[i++] = s.nextInt();
		System.out.printf("4��° ���ڸ� �Է��ϼ��� : ");
		aa[i++] = s.nextInt();

		hap = aa[0] + aa[1] + aa[2] + aa[3];

		System.out.println("�հ� ==> " + hap);

		for (int j = 0; j < aa.length; j++) { // �迭�� ũ���� 4��� ���� �������ش�
			System.out.println("aa[" + j + "] : " + aa[j]);
		}

	}

}
