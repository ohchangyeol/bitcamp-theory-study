package work.ex04;

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
	public void printEmployee(String[] jobs) throws SQLException {
		
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(dburl , "hr" ,"hr");
		PreparedStatement pstmt = null;
		ResultSet rs= null ;
		
		String query = "select employee_id, first_name, salary from employees where job_id in (select job_id from jobs where job_title = ? or job_title = ?)";

		pstmt = con.prepareStatement(query);

		for(int i = 0 ; i < jobs.length; i++) {
			pstmt.setString(i+1, jobs[i] );
		}
		
		
		rs = pstmt.executeQuery();
		
		while (rs.next()) {
			String id = rs.getString("employee_id");
			String firstName = rs.getString("first_name");
			int sal= rs.getInt("salary");
			System.out.println(id+"\t"+firstName+"\t\t"+sal);
		}
		
		if(pstmt != null)	pstmt.close();
		if(con != null )	con.close();
		if(rs != null )	 	rs.close();
	}
	
	//main
	public static void main(String[] args) throws SQLException {
		 String[] jobs = {"Accountant","Stock Clerk"};
		 new EmpManager().printEmployee(jobs);
	}

}
