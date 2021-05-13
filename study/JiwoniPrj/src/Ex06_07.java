
public class Ex06_07 {

	int bbbb=0; //난 클래스 전체에서 사용되는 변수 (전역변수)
	
	public static void main(String[] args) {
		
		int hap=0;
		int i; // Main 함수 실행되는 동안만 살아있는 변수
		
		for(i=1;i<=10;i++) {
			int b =0; // for문 한번 돌때만 살아있는 변수
			hap=hap+i;
		}
		
		System.out.printf("1에서 10까지의 합:%d \n", hap);
	}
//지역변수->부분적, 전역변수->자바 파일 전체
}
