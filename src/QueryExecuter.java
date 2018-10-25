import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class QueryExecuter {
	private Boolean printMetaData;
	
	public QueryExecuter(Boolean printMetaData) {
		this.printMetaData = printMetaData ? printMetaData : false;
	}
	
	ResultSet execute(String queryString) {
		Connection connection = null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			try {
				connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Compiere", "1234");
				Statement statement = connection.createStatement();
				resultSet = statement.executeQuery(queryString);
				System.out.println("Query executed: "+ queryString);
				
				// print established things
				if (printMetaData) {
					ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
					int column_idx = 1, column_size = resultSetMetaData.getColumnCount();
					while (column_idx <= column_size) {
						System.out.print(resultSetMetaData.getColumnName(column_idx) + "\t");
						column_idx += 1;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (connection != null) {
					try {
//						connection.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultSet;
	}
}
