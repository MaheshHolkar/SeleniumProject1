package Day1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;





public class jdbcconnection {

	public static void main(String[] args) throws SQLException, Exception {
		
	

	Connection	con =DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Maa@1234");
	System.out.println("hiiii");
	Statement st= con.createStatement();
	ResultSet rs = st.executeQuery("select * from credentials where sceenario = 'basiccard' ");
	while(rs.next()) {
	String username =rs.getString("UserName");
	String password = rs.getString("password");
	String sceenario = rs.getString("sceenario");
System.out.println(sceenario+" "+username+" "+password);
	}
	st.close();
	con.close();
	
	}
	}

