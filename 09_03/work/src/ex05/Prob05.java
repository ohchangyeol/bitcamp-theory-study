package work.ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Prob05 {
	
	//main
	public static void main(String[] args) throws SQLException {
		// 유효성 체크
		if (args.length != 1) {
			System.out.println("부서의 아이디를 입력하세요...");
			System.exit(0);
		}
		
		String dept_id = args[0];
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String user = "hr";
			String password = "hr";
			con = DriverManager.getConnection(dburl , user ,password);
			
			String query = "select EMPLOYEE_ID, vt.department_name , SALARY ,vt.avg_salary from employees ,(select d.department_name, d.department_id vtid, round(avg(e.salary)) avg_salary from employees e inner join departments d on e.department_id = d.department_id where d.department_id = ? group by d.department_name, d.department_id )VT where department_id = vt.vtid ";

			pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, Integer.parseInt(dept_id));
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int cou = metaData.getColumnCount();
			
			String str = "";
			for (int i = 1; i <= cou; i++) {
				str += metaData.getColumnName(i) + "\t";
			}
			System.out.println(str);

			while (rs.next()) {
				String id = rs.getString("EMPLOYEE_ID");
				String deptName = rs.getString("department_name");
				int sal= rs.getInt("salary");
				int avgSal= rs.getInt("avg_salary");
				
				System.out.println(id+"\t\t"+deptName+"\t"+sal+"\t"+avgSal);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println();
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("절차 중 오류 :: " + e.getErrorCode());
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null )	con.close();
				if(rs != null )	 	rs.close();
			} catch (SQLException e) {
				System.out.println("close 오류 :: " + e.getErrorCode());
				e.printStackTrace();
			}
		}
		 
	}

}
