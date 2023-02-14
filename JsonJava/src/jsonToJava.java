
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jsonToJava {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = null;
		connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root", "root");
		Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery("select * from CustomerInfo;");
	while(resultSet.next()) {
		System.out.print(resultSet.getString(1));
		System.out.print(resultSet.getString(2));
		System.out.print(resultSet.getInt(3));
		System.out.print(resultSet.getString(4));
		System.out.println("");
	}
	
	}

}
