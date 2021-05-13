
public class Ex07_02 {

	public static void main(String[] args) {

		int i;
		int hap = 0;

		i = 1;
		while (i < 11) {
			hap += i;
			i++;
		}
		System.out.println("1부터 10까지의 합 : " + hap);

	}

}
 // while 문을 쓸 때는 변화를 주면서 조건식 연산이 들어가게 해야함
// 조건절에 변화를 줄 수 있는 구문이 중괄호 안에 존재해야 한다. (i++ 의미함)