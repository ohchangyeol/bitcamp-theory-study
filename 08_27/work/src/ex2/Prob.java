package ex2;

import java.util.List;
import java.util.LinkedList;

public class Prob {
	
	private static String[] stringSplit(String str1 ,String str2) {
		//구현하시오.
		List<String> listArr = new LinkedList<String>();
		 String temp = "";
		 for(int i =0; i < str1.length(); i++) {
			 char c = str1.charAt(i);
			 if(c == '#' || i == str1.length()-1) {
				 listArr.add(temp);
				 temp= "";
			 }else {
				 temp += c;
			 }
		 }
		return listArr.toArray(new String [listArr.size()]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str,"#");
		System.out.println("===문자열 처리 결과===");
		
		for(int i =0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

}
