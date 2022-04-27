package day13;
import java.sql.*;
public class Join {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		 String url = "jdbc:mysql://localhost:3306/";
		 String dbName = "testdb1";
		 String driver = "com.mysql.jdbc.Driver";
		 String userName = "root";
		 String password = "Rakshita@14";
		 try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con = DriverManager.getConnection(url+dbName,userName,password);
		  Statement st = con.createStatement();
		  ResultSet rs = st.executeQuery("select Employee_name from Employees e,Departments d where e.Department_id=d.Department_id");
		  while( rs.next() ) {
		  String data = rs.getString(1);
		  System.out.println("Employee with no project");
		  System.out.println( data );
		  }
		  System.out.println("Results");
		  st.close();
		  }
		  catch( Exception e ) {
		  System.out.println(e.getMessage());
		  e.printStackTrace();
		  }

	}

}
