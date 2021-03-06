package work.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpStatistics {
	
	//static constructor
	static{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// method
	public void printStatistics(int maxSalary) throws SQLException {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection con = DriverManager.getConnection(url , "hr" ,"hr");
		PreparedStatement pstmt = null;
		ResultSet rs= null ;
		String query = "select  j.job_title , avg(e.salary) "
						+ "from    employees e, jobs j "
						+ "where   e.JOB_ID = j.JOB_ID "
						+ "group by j.job_title "
						+ "having  ? < avg(e.salary) "
						+ "ORDER by avg(e.salary) desc" ;
		pstmt = con.prepareStatement(query);
		pstmt.setInt(1 , maxSalary);
		rs = pstmt.executeQuery();
		System.out.println("===============================");
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("===============================");
		
		while (rs.next()) {
			System.out.println("["+rs.getString("job_title")+"] "+ rs.getInt("avg(e.salary)"));
		}
		
		if(pstmt != null)	pstmt.close();
		if(con != null )	con.close();
		if(rs != null )	 	rs.close();
	}
	
	//main
	public static void main(String[] args) throws SQLException {
		 int maxSalary = 10000;
		 new EmpStatistics().printStatistics(maxSalary);
		 
		 maxSalary = 15000;
		 new EmpStatistics().printStatistics(maxSalary);
	}

}
