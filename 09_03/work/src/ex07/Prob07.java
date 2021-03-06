package work.ex07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prob07 {
	//field
	static PreparedStatement pstmt;
	static ResultSet rs;
	static Connection con;
	
	//static constructor
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//constructor
	public Prob07() {}
	
	// method
	private static void printEmployeeList(String cityName,String deptName) throws SQLException {
		//Local variable
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String query = "select l.city, d.department_name ,e.first_name , e.salary from employees e , departments d , locations l where e.department_id = d.department_id and d.location_id = l.location_id and upper(l.city) like upper('%'||?||'%') and upper(d.department_name)like upper('%'||?||'%')";
		
		con = DriverManager.getConnection(dburl , "hr" ,"hr");
		pstmt = con.prepareStatement(query);

		//set
		pstmt.setString(1, cityName);
		pstmt.setString(2, deptName);
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String cityRecord = rs.getString("city");
			String deptRecord = rs.getString("department_name");
			String nameRecord = rs.getString("first_name");
			String salaryRecord = rs.getString("salary");
			System.out.println(cityRecord+"\t\t"+deptRecord+"\t\t"+nameRecord+"\t\t"+salaryRecord);
		}
		
		if(pstmt != null)	pstmt.close();
		if(con != null )	con.close();
		if(rs != null )	 	rs.close();
	}
	//main
	public static void main(String[] args) throws SQLException {
		Prob07.printEmployeeList("lon", "resource");
	}

	

}
