package lesson;

import java.sql.*;
import java.util.*;


//import oracle.jdbc.driver.*;

public class ConnectionTest02 {
	//main
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user ="scott";
		String pwd = "tiger";
		
		OracleDriver od = new OracleDriver();
		
		Properties info = new Properties();
		info.put("user", user);
		info.put("password", pwd);
		
		Connection con = od.connnect(url,info);
//		=================================================
		
		Class.forName("oarcle.jdbc.driver.OarcleDriver");
		Connection con = DriverManager.getConnection(url,user,pwd);
		
		Statement stmt= con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM product");
		
		rs.next();
		
		String productName = rs.getString("p_name");
//		String productName = rs.getString(1);
		int productPrice = rs.getInt("p_price");
//		int productPrice = rs.getInt(2);
		
		System.out.println("��ǰ�� : "+productName);
		System.out.println("�� �� : "+productPrice);
		
		//������ ��ü�� close �Ѵ�
		rs.close();
		stmt.close();
		con.close();
		
		
		
	}

}