
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

   public static void main(String[] args) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      // Ű����� �޾ƶ�
      // �ǽð� ���ڿ��� �о �޸𸮿� �ø���(new)
      // ��Ƽ� ���� �� �޸𸮿� �ø�
      String str = bf.readLine();
      // readLine�� ���ڿ��� ����ġ�� str�� ������ ����//���� �ٺ�����

      int a = Integer.parseInt(str);
      //������ ���� a�� ���۰��� �����ϴµ� ���ڿ��� ���ڷ� �ٲ� (����ȯ)


      String[] arr = bf.readLine().split(" ");
      // ���ڿ� ���� arr�� "(����) "�� ����

      int max = Integer.parseInt(arr[0]); // ���ڿ��� ���� min�� ������ ���� ���·� �ٲ�
                                          // �迭 ù��° ĭ(0)�� �Է�  // �ε����ѹ�0 
      int min = Integer.parseInt(arr[0]); // ���ڿ��� ���� max�� ������ ���� ���·� �ٲ�
                                          // �迭 �ι�° ĭ(1)�� �Է�
                               
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