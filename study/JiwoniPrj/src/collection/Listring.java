package collection;

import java.util.*;

public class Listring {

	public static void main(String[] args) {
		List<String> rList = new LinkedList<String>();
	      
	      rList.add("������");
	      rList.add("ȫ�浿");
	      rList.add("�Ӳ���");
	      rList.add("��浿");
	      
	      System.out.println("�迭�� ũ�� " + rList.size());
	      
	      for (int i = 0; i < rList.size(); i++) {
	         System.out.println("[" + i + "]��° �迭 ������ : " + rList.get(i));
	      }
	      Iterator<String> it = rList.iterator();
	      while (it.hasNext()) {
	         String name = (String) it.next();
	         
	         System.out.println("�̸� : " + name);
	      }
	   }

	}