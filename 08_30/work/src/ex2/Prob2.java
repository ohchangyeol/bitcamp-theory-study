package ex2;

import java.util.HashMap;
import java.util.Map;

public class Prob2 {
	//Field
	
	//method
	private static String  getParameter(String url , String paramName) {
		String temp = url.substring(url.indexOf("?")+1);
		return Prob2.parsingMap(temp).get(paramName);
	}

	private static Map<String, String> parsingMap(String temp) {
		String key ="";
		String value ="";
		boolean isKey= true;
		Map<String, String> datas= new HashMap<String, String>();
		for (int i =0; i < temp.length(); i++) {
			if(temp.charAt(i) == '=') {
				isKey = false;
			}else if(temp.charAt(i) == '&'){
				isKey = true;
				datas.put(key, value);
				key ="";
				value ="";
			}else {
				if(isKey){
					key += temp.charAt(i);
				}else if (!isKey) {
					value += temp.charAt(i);
				}
			}
		}
		datas.put(key, value);
		return datas;
	}
	
	//main method
	public static void main(String[] args) {
		String url1 = "https://localhost/order?prodld=PROD-001&prodName=겔럭시3&price=980000";
		
		String prodName = getParameter(url1,"prodName");
		System.out.println("제품이름 :" + prodName);
		
		String url2 = "https://localhost/registUser?userId=USER-001&userName=홍길동&address=서울시 강남구&userAge=26";
		
		String userAddress = getParameter(url2, "address");
		System.out.println("회원 주소 : "+ userAddress);
		
	}

}
