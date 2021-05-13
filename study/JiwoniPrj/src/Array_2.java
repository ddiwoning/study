
public class Array_2 {

	public static void main(String[] args) {
		int aa[] = { 100, 200, 300, 400 };
		int bb[] = new int[] { 100, 200, 300 };

		int cc[];
		cc = new int[] { 100, 200 };
		int[] dd = new int[1];
		dd[0] = 100;
		int i;

		for (i = 0; i < 4; i++)
			System.out.printf("aa[" + i + "]==> " + aa[i] + "\t");
		System.out.println("\n");

		for (i = 0; i < 3; i++)
			System.out.printf("bb[" + i + "]==> " + bb[i] + "\t");
		System.out.println("\n \t");

		for (i = 0; i < 2; i++)
			System.out.printf("cc[" + i + "]==> " + cc[i] + "\t");
		System.out.println("\n");

		for (i = 0; i < 1; i++)
			System.out.printf("dd[" + i + "]==> " + dd[i] + "\t");
		System.out.println("\n");

	}

}
