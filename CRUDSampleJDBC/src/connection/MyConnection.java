package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	Connection cx = null;
	
	public Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cx = DriverManager.getConnection("jdbc:mysql://localhost:3306/migros", "root", "mysql");
			System.out.println("Connected :)");
		} catch (ClassNotFoundException | SQLException e ) {
			System.out.println("Not connected :(");
		}
		return cx;
	}
	
	public static void main(String[] args) {
		MyConnection cx = new MyConnection();
		cx.connect();
	}
}
