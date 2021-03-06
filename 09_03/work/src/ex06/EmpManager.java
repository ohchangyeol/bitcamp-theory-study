package work.ex06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpManager {
	
	
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// method
	public void printEmployee(String city , int lo , int hi) throws SQLException {
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(dburl , "hr" ,"hr");
		PreparedStatement pstmt = null;
		ResultSet rs= null ;
		
		String query = "select e.last_name , d.department_name from employees e, departments d where e.department_id = d.department_id and d.location_id = (select location_id from locations where city = ?) and e.salary between ? and ? ";

		pstmt = con.prepareStatement(query);
		//set
		pstmt.setString(1, city);
		pstmt.setInt(2, lo);
		pstmt.setInt(3, hi);
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String lastName = rs.getString("last_name");
			String deptName = rs.getString("department_name");
			System.out.println(lastName+"\t\t"+deptName);
		}
		
		if(pstmt != null)	pstmt.close();
		if(con != null )	con.close();
		if(rs != null )	 	rs.close();
	}
	
	//main
	public static void main(String[] args) throws SQLException {
		 new EmpManager().printEmployee("South San Francisco", 7000, 10000);
	}

}
