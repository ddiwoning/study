
public class HOHO {

	public static void main(String[] args) {
		int[] num = new int [10];
		
		for(int i=0;i<10;i++) { //여기서 i는 for 안에 지역변수
			num[i]=(i+1)*10;
	
}
		int i=0; // 얘는 for문 밖에 있는 전역함수, while문 이용한거
		while(i<10) {
			System.out.println("num["+i+"] "+num[i]);
			i++;
		}
	}

}
