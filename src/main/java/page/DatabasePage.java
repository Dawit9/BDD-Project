package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	public static String getData(String columnName) throws ClassNotFoundException, SQLException {
		
		//setting mySql properties
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl = "jdbc:mysql://localhost:3306/oct2020a";
		String userName = "root";
		String password = "Root";
		String query = "select * from users";
		
		//Creating a connection to local DB
		Connection conn = DriverManager.getConnection(sqlUrl, userName, password);
		
		//Empowering the conn ref variable to execute queries
		Statement smt = conn.createStatement();
		//Delivering the query
		ResultSet rs =  smt.executeQuery(query);
		
		while(rs.next()) {
		return rs.getString(columnName);
		}
		
        return columnName;
}
}