import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private static String driverName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	private static String user = "root";
	private static String password = "mysql";

	public Connection getConnection() {
		Connection con = null;

		try {
			Class.forName(driverNane);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}