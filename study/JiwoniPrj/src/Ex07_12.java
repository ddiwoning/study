
public class 0 {

	public static void main(String[] args) {
		int hap = 0;
		int i;

			for(;;) // for(;;) ��ſ� while (true) ���൵ ��
				
				for(i=1;i<=100;i++) {
					hap += i;
					
					if(hap<2000) {
						System.out.println("�հ�"+ hap);
						hap =0;
					//	break;  // return ���� break�� ������ ���ѷ���
						return; // ������ �����Ű�� ���� (���� �Լ��� ������ �����Ű�� ������)
						
					}System.out.println("������ �ݺ���...");
				}	
			
	}
		}
	
// for �� : �ݺ� Ƚ���� �˰� ���� �� ��
// while �� : �ݺ� Ƚ���� �� �� ��

// while �� �� �� while�� �ȿ� �� ���ǿ� ��ȭ�� �� �� �ִ°� �־�� ��... �ȱ׷��ٸ� ���ѷ����� ��� 

//do while : ���ǿ� ������� ������ �ѹ��� ����� �� ���� üũ�Ͽ� ����� 
// break : ���Ǹ� ���߰� �ٽ� ���۽�Ŵ

//������ �����Ű�� ������ return; ��