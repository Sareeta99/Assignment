package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JdbcExampple
{

 public static void main(String[] args) throws SQLException {
// TODO Auto-generated method s

 // 1. Load the driver

 DriverManager.registerDriver(new com.mysql.jdbc.Driver());

 // 2. Establish the connection
String url = "jdbc:mysql://localhost:3306/jdbc";
String username = "root";
String password = "Sarita@123";
Connection con = DriverManager.getConnection(url, username, password);

 // 3. create the statement object

 java.sql.Statement st = con.createStatement();

 // 4. write the query and execute it
String sql = "select * from student";

 // 5. store the data in the result set
ResultSet rs = st.executeQuery(sql);

 // 6 . display the resultset data
while (rs.next())
System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

 // 7. close the connections
rs.close();
st.close();
con.close();
DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
}

}
