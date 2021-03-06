package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Prob1 {
	BufferedReader br;
	//method
	public List<String> getList() throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader("./list.txt"));
		String source = "";
		List <String> txtList = new ArrayList<String>();
		try {
			while ((source=br.readLine()) != null) {
				String[] parsingArr = source.split("/");
				String temp = "";
				for (int i = 0 ; i < parsingArr.length;i++ ) {
						temp += parsingArr[i]+" , ";
				}// end of for
				
				if(parsingArr[1].equalsIgnoreCase("java") && 80 <= Integer.parseInt(parsingArr[2]) || parsingArr[1].equalsIgnoreCase("sql") && 90 <= Integer.parseInt(parsingArr[2])) {
					temp+= "수료";
					txtList.add(temp);	
				}else {
					temp+= "미수료";
					txtList.add(temp);
				}
			}// end of while
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}//end of if
			
		}// end of finally
		return txtList;
	}// end of method
	
	//main method
	public static void main(String[] args) {
		Prob1 e = new Prob1();
		try {
			List<String> scores = e.getList();
			for(int i = 0; i < scores.size(); i++) {
				System.out.println(scores.get(i));
			}
		} catch (Exception e2) {
			System.out.println(e2);
			e2.printStackTrace();
		}
		
			
			

	}

}
