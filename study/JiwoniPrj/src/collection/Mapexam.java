package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapexam {

	public static void main(String[] args) {
		
		Map<String, String> pMap = new HashMap<>();
		//HashMap 데이터타입 정의시 키와 값에 저장될 데이터 타입을 정의
		
		pMap.put("name", "이지원");
		pMap.put("email", "iridescent@gmail.com");
		pMap.put("dept", "데이터분석과");
		pMap.put("dept", "무슨과?"); //중복되면 덮어쓰기됨
		
		System.out.println("-----------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("-----------------------");

	}

}
