import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_demo","root","root");
		Statement s = c.createStatement();
		//s.execute("insert into customer values(2,'Arun','9900303030')");
		ResultSet rs = s.executeQuery("select * from customer");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		s.executeUpdate("update customer SET cname ='BALU' where cno=2");
		System.out.println("After update...");
		ResultSet rs1 = s.executeQuery("select * from customer");
		while(rs1.next()) {
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3));
		}
		c.close();
	}

}