
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // 키보드로 받아라
      // 실시간 문자열로 읽어서 메모리에 올린다(new)
      // 모아서 보낸 후 메모리에 올림
      String str = bf.readLine();
      // readLine은 문자열을 엔터치면 str로 보내서 저장//나는 바보에요

      int a = Integer.parseInt(str);
      //정수형 변수 a에 버퍼값을 대입하는데 문자열을 숫자로 바꿈 (형변환)


      String[] arr = bf.readLine().split(" ");
      // 문자열 변수 arr은 "(띄어쓰기) "로 나눔

      int max = Integer.parseInt(arr[0]); // 문자열로 받은 min을 정수형 변수 형태로 바꿈
                                          // 배열 첫번째 칸(0)에 입력  // 인덱스넘버0 
      int min = Integer.parseInt(arr[0]); // 문자열로 받은 max를 정수형 변수 형태로 바꿈
                                          // 배열 두번째 칸(1)에 입력
                               
      for (int i = 0; i < a; i++) {
         
         if (min > Integer.parseInt(arr[i])) {
            min=Integer.parseInt(arr[i]);

         }else if (max < Integer.parseInt(arr[i])) {
            max = Integer.parseInt(arr[i]);
         }
         

      }bw.write(min + " " + max);
      bf.close();
      bw.flush();
      bw.close();
   }
}