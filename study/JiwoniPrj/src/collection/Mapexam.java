package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapexam {

	public static void main(String[] args) {
		
		Map<String, String> pMap = new HashMap<>();
		//HashMap ������Ÿ�� ���ǽ� Ű�� ���� ����� ������ Ÿ���� ����
		
		pMap.put("name", "������");
		pMap.put("email", "iridescent@gmail.com");
		pMap.put("dept", "�����ͺм���");
		pMap.put("dept", "������?"); //�ߺ��Ǹ� ������
		
		System.out.println("-----------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("-----------------------");

	}

}
