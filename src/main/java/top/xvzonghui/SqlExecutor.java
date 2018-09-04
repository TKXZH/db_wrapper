package top.xvzonghui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author zonghuixu
 */
public class SqlExecutor {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			shutDown();
		}
		Properties properties = new Properties();
		properties.load(SqlExecutor.class.getClassLoader().getResourceAsStream("database.properties"));
		String sql = args[1];
		String driverName = null;
		String url = null;
		String userName = null;
		String passWord = null;
		if ("redshift".equals(args[0])) {
			driverName = properties.getProperty("redshiftDriver");
			url = properties.getProperty("redshiftUrl");
			userName = properties.getProperty("redshiftUserName");
			passWord = properties.getProperty("redshiftPassWord");
		} else if ("mysql".equals(args[0])) {
			driverName = properties.getProperty("mysqlDriver");
			url = properties.getProperty("mysqlUrl");
			userName = properties.getProperty("mysqlUserName");
			passWord = properties.getProperty("mysqlPassWord");
		} else {
			shutDown();
		}

		if (driverName == null) {
			shutDown();
		}

		Connection connection;
		Class.forName(driverName);
		connection = DriverManager.getConnection(url, userName, passWord);
		Statement statement = connection.createStatement();
		System.out.println("now executing sql " + sql);
		statement.execute(sql);
		statement.close();
		connection.close();
	}

	public static void shutDown() {
		System.exit(1);
	}
}
