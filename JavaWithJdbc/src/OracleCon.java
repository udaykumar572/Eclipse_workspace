import java.sql.*;
public class OracleCon {
	
public static void main(String ar[])
{
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from regions");
		while(rs.next())
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
		con.close();}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}

