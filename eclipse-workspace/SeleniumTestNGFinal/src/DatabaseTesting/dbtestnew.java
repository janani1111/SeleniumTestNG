package DatabaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

//import com.mysql.cj.xdevapi.Statement;

public class dbtestnew {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","test","test");  
				Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/student");
				java.sql.Statement statement =	connection.createStatement();
				statement.executeUpdate("insert into details values (5, 'John', 40)");
				ResultSet result =  statement.executeQuery("Select * from details");
				while (result.next()) 
				{
					System.out.println(result.getString(1)+ "    "+result.getString(2)+ "    "+result.getString(3));
				}
	}

}
