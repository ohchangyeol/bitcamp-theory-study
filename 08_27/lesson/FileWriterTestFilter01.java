//package jp03.part05;
import java.io.*;

/*
*FileName : FileWriterTestFilter01.java
*
* ==>FileCopy 하는 App 작성
1.Keyboard로 FileName을 입력
2.File의 내용을 read() ==> FileReader
3.File로 내용을 write() ==> FileWriter
*/

public class FileWriterTestFilter01 {
	//main method
	public static void main(String[] args)throws Exception{




		//필요객체 Stream/String 인스턴스 declaration
		BufferedReader br = null;
		BufferedWriter bw = null;
		String fileName = "";
		String copyFileName = "";

		int readCount = 0; // read를 Count 하기위한 변수
		
		System.out.print("copy할 file 이름을 입력하세요 : ");
		//copy할 FileName 입력받기,,
		fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();


		//원본파일 Data를 read 할 수 있는 BufferedReader 생성
		br = new BufferedReader(new FileReader(fileName));


		//사본 파일 이름 만들기
		copyFileName = fileName + " _copy";

		//Data를 write할 수 있는 BufferedWriter 생성
		bw = new BufferedWriter(new FileWriter(copyFileName));

		//read / writer 하는 while 문
		String source = null;

		while((source=br.readLine()) != null){
			readCount++;
			bw.write(source);
			bw.newLine();
			}

		bw.flush();	//flush를 잊지 말것

		//Stream close()
		bw.close();
		br.close();

		System.out.print("======================= ");
		System.out.print("===>> read횟수 readCount : " + readCount);
		System.out.print("======================= ");

	}//end of main
}//end of class