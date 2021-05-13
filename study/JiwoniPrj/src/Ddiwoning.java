
public class Ddiwoning {

	public static void main(String[] args) {

		int i;
		for (i = 1; i <= 100; i++) {
		//if (i % 3 == 0 || i % 5 == 0) {
				//System.out.println("3 또는 5의 배수" + " = " + i);
			//if (i % 3 ==0 && i%5==0) {
				//System.out.println("[3과 5의 배수]"+i);
				
				if (i % 15 ==0 ) {
					System.out.println("[3과 5의 배수]"+i);
			} // else
				// System.out.println(i);

		}

	}
}
//1부터 100까지 중에서 3의 배수와 5의 배수인 숫자만 출력하시오.