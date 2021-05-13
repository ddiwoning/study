package collection;

import java.util.*;

public class Listring {

	public static void main(String[] args) {
		List<String> rList = new LinkedList<String>();
	      
	      rList.add("이협건");
	      rList.add("홍길동");
	      rList.add("임꺽정");
	      rList.add("고길동");
	      
	      System.out.println("배열의 크기 " + rList.size());
	      
	      for (int i = 0; i < rList.size(); i++) {
	         System.out.println("[" + i + "]번째 배열 기억공간 : " + rList.get(i));
	      }
	      Iterator<String> it = rList.iterator();
	      while (it.hasNext()) {
	         String name = (String) it.next();
	         
	         System.out.println("이름 : " + name);
	      }
	   }

	}