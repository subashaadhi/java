package javabasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Learn_jdbc {

	public static void main(String[] args) throws SQLException {
		
		String url_Path = "jdbc:mysql://localhost:3306/labour_management";
		String user = "root";
		String passkey = "638245";
		
		Connection c = DriverManager.getConnection(url_Path,user,passkey);
		
////		PreparedStatement ps = c.prepareStatement("update attendance_template set salary =1000 where salary =1200");
//		PreparedStatement ps = c.prepareStatement("insert into attendance_template values(?,?,?,?)");
//		ps.setInt(1,1);
//		ps.setString(2, "Mani");
//	    ps.setString(3, "A");	
//	    ps.setInt(4, 0);
		
		PreparedStatement ps = c.prepareStatement("select * from attendance_template where  name = ? and salary =?" );
		
	    ps.setString(1, "Kumar");
	    ps.setInt(2, 1000);
	    ResultSet rs = ps.executeQuery();
	    ps.close();
	    
	    
		
		
 
		
//		ps.execute();
//		ps.close();
	}

}
