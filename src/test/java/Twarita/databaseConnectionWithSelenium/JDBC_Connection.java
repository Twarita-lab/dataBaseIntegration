package Twarita.databaseConnectionWithSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/qadbt";
		
		//1st give the destination with "Server+host+port+dbName", username, password
		Connection connection = DriverManager.getConnection(url, "root", "*********");
		
		//Now figure out the route and vehicle
		Statement statement = connection.createStatement();
		
		//Start the journey
		 ResultSet result1 = statement.executeQuery("Select ID from employee_info where Location='Samui'");
		 
		 //Even if you know it's only 1 result do this
		 result1.next();
		 System.out.println(result1.getInt(1));
		 
		 ResultSet result2 = statement.executeQuery("Select * from employee_info where Location='Koh Phi'");
		 while(result2.next()) {
			 System.out.println(result2.getInt("ID"));
			 System.out.println(result2.getString("Name"));
		 }
		 
		

	}

}
