import java.util.*;

public class ArrayCopy{
	
	public List<String> moveToVector(String[] datas){
		List<String> temp = new Vector();
		for(String str : datas){
			temp.add(str);
		}
//		Stack<String> temp = new Stack();
//		for (int i = 0 ;i <datas.length ;i++ ){
//			temp.push(datas[i]);
//		}
//		for(int i = 0 ; i < temp.length; i++){
//			System.out.println(temp[i]);
//		}
//		

		return temp;//datas;
	}

	public static void main(String[] agrs){
		
		ArrayCopy ac= new ArrayCopy();
		String[] datas = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));
		
		
	}//end of main
}//end of class 