import java.sql.*;
public class OracleCons {
	
public static void main(String ar[])
{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
		PreparedStatement stmt=con.prepareStatement("insert into Regions values(?,?)");
		stmt.setInt(1, 101);
		stmt.setString(2,"India");
		int i=stmt.executeUpdate();
		System.out.println(i+"records inserted");
		con.close();
		
				
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}

