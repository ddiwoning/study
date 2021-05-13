package collection;

import java.util.*;

public class ListMapExam {

	public static void main(String[] args) {

		List<HashMap<String, String>> rList = new ArrayList<>(); 
		// List에 Map이라는 것을 넣을겁니다. 여기서 키와 값은 모두 String 입니다. 

		HashMap<String, String> pMap = new HashMap<>(); 
		// Map은 String, String 즉, 키와, 값으로 메모리에 올리겠습니다. 저장타입은 String

		pMap.put("name", "이지원");
		pMap.put("email", "irides@");
		pMap.put("addr", "인천");
		pMap.put("dept", "데분");

		rList.add(pMap); // 얘는 안날리고 살아있음

		pMap = null;

		pMap = new HashMap<>(); //Map에다가 다시 String값으로 메모리에 올림

		pMap.put("name", "김용우");
		pMap.put("email", "kyoung");
		pMap.put("addr", "파주");
		pMap.put("dept", "체대");

		rList.add(pMap); // rList에다가 위에 네줄 값을 넣었다.

		pMap = null; // 메모리 값을 아예 날려버려라

		Iterator<HashMap<String, String>> it = rList.iterator();
		//Iterator를 쓰는 이유는 반복조건을 알기 때문에 강제로 변환시킴.
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();

			System.out.println("###### 반복시작!!! #######");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr: " + rMap.get("addr"));
			System.out.println("dept: " + rMap.get("dept"));

			rMap = null;
			System.out.println("############### 반복끝#########");
		}
	}

}

// 넘넘 중요한 ... 걍 외워서라도 이해해라잉. ...  .. . .. . . .. . . .. ... ..넵넵넵