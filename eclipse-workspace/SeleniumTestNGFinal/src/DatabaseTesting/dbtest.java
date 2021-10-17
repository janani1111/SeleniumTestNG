package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement;

public class dbtest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","test","test");  
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/Janani");
	java.sql.Statement statement =	connection.createStatement();
	ResultSet result =  statement.executeQuery("Select * from names");
	while (result.next()) 
	{
		System.out.println(result.getString(1)+ "    "+result.getString(2));
	}
		
	}
	
}
