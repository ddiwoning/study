
public class Imptnt {

	public static void main(String[] args) {
		int a = 10;

		a++; // a+1 = 11
		System.out.printf("a ++ ==> %d \n", a);
		
		System.out.println("a : " + a);
		System.out.println("a++ :" + a++); // ����������

		System.out.println("a : " + a);
		System.out.println("++a :" + ++a); // ����������

		a--;
		System.out.printf("a -- ==> %d \n", a);

		a += 5;
		System.out.printf("a +=5 ==> %d \n", a);

		a -= 5;
		System.out.printf("a -=5==> %d \n", a);

		a *= 5;
		System.out.printf("a *= 5 ==> %d \n", a);

		a /= 5;
		System.out.printf("a /=5 ==> %d \n", a);

		a %= 5;
		System.out.printf("a %%=5 ==> %d \n", a);

	}

}
