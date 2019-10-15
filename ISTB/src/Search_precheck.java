import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

//import javax.servlet.http.HttpSession;

public class Search_precheck {
	
	public boolean check(int cust_id) throws SQLException {
		
		Connection conn = DbConnector.getInstance();
		String query1 = "select retailer_id from customer1 where cust_id=? and retailer_id is not null";
			PreparedStatement st1 = conn.prepareStatement(query1);
			System.out.println("prepared statement");
			st1.setInt(1, cust_id);
			System.out.println("set 1");
			ResultSet rs=st1.executeQuery();
			System.out.println("Resultset");
			if(rs.next()) {
				System.out.println("ifif");
				return true;
			}
			
			rs.close();
			st1.close();
			conn.close();
			return false;
			
	}
}
