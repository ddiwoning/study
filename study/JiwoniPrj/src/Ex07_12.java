
public class 0 {

	public static void main(String[] args) {
		int hap = 0;
		int i;

			for(;;) // for(;;) 대신에 while (true) 써줘도 됨
				
				for(i=1;i<=100;i++) {
					hap += i;
					
					if(hap<2000) {
						System.out.println("합계"+ hap);
						hap =0;
					//	break;  // return 없이 break만 있으면 무한루프
						return; // 완전히 종료시키는 구문 (메인 함수를 완전히 종료시키고 끝내라)
						
					}System.out.println("아직도 반복중...");
				}	
			
	}
		}
	
// for 문 : 반복 횟수를 알고 있을 때 씀
// while 문 : 반복 횟수를 모를 때 씀

// while 문 쓸 때 while문 안에 그 조건에 변화를 줄 수 있는게 있어야 함... 안그런다면 무한루프로 출력 

//do while : 조건에 상관없이 무조건 한번은 실행된 후 조건 체크하여 실행됨 
// break : 조건만 멈추고 다시 동작시킴

//완전히 종료시키고 싶으면 return; 씀