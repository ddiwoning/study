package collection;

import java.util.*;

public class ListMapExam {

	public static void main(String[] args) {

		List<HashMap<String, String>> rList = new ArrayList<>(); 
		// List�� Map�̶�� ���� �����̴ϴ�. ���⼭ Ű�� ���� ��� String �Դϴ�. 

		HashMap<String, String> pMap = new HashMap<>(); 
		// Map�� String, String ��, Ű��, ������ �޸𸮿� �ø��ڽ��ϴ�. ����Ÿ���� String

		pMap.put("name", "������");
		pMap.put("email", "irides@");
		pMap.put("addr", "��õ");
		pMap.put("dept", "����");

		rList.add(pMap); // ��� �ȳ����� �������

		pMap = null;

		pMap = new HashMap<>(); //Map���ٰ� �ٽ� String������ �޸𸮿� �ø�

		pMap.put("name", "����");
		pMap.put("email", "kyoung");
		pMap.put("addr", "����");
		pMap.put("dept", "ü��");

		rList.add(pMap); // rList���ٰ� ���� ���� ���� �־���.

		pMap = null; // �޸� ���� �ƿ� ����������

		Iterator<HashMap<String, String>> it = rList.iterator();
		//Iterator�� ���� ������ �ݺ������� �˱� ������ ������ ��ȯ��Ŵ.
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();

			System.out.println("###### �ݺ�����!!! #######");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr: " + rMap.get("addr"));
			System.out.println("dept: " + rMap.get("dept"));

			rMap = null;
			System.out.println("############### �ݺ���#########");
		}
	}

}

// �ѳ� �߿��� ... �� �ܿ����� �����ض���. ...  .. . .. . . .. . . .. ... ..�ܳܳ�