import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;
//import java.sql.Statement;

//import javax.servlet.http.HttpSession;

public class inventory_details {
	Connection conn=null;
	PreparedStatement st1=null;
	public boolean check(int cust_id) throws SQLException {
		
		conn = DbConnector.getInstance();
		String query1 = "select retailer_id from customer1 where cust_id=? and retailer_id is not null";
			st1 = conn.prepareStatement(query1);
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
	public List<List<String>> search_inventory(String STB_type,String billing_type) throws SQLException{
		conn = DbConnector.getInstance();
		List<String> al=null;
		  List<List<String>> emp_list =new ArrayList<List<String>>();
		  String query = "select * from stb inner join stb_inventory on stb.stb_type = stb_inventory.stb_type where stb.stb_type ='" + STB_type+ "' AND stb.stb_billing_type ='" +billing_type + "'AND stb_inventory.stb_status='unassigned'";
		  System.out.println("query " + query);
		  PreparedStatement st2= conn.prepareStatement(query);
		  //st1.setString(1, STB_type);
		  //st1.setString(2,billing_type);
		  ResultSet  rs = st2.executeQuery();
		  ResultSetMetaData rsmd = rs.getMetaData();
		  int columnsNumber = rsmd.getColumnCount();
		  System.out.println("no. of rows"+columnsNumber);
		  while(rs.next()){
		  al  = new ArrayList<String>();
		  
		  al.add(rs.getString(2));
		  al.add(rs.getString(3));
		  al.add(Double.toString(rs.getDouble(4)));
		  al.add(Double.toString(rs.getDouble(5)));
		  al.add(Double.toString(rs.getDouble(6)));
		  al.add(Double.toString(rs.getDouble(7)));
		  al.add(Double.toString(rs.getDouble(8)));
		  al.add(Double.toString(rs.getDouble(9)));
		  al.add(Double.toString(rs.getDouble(10)));
		  al.add(rs.getString(11));
		  al.add(Double.toString(rs.getDouble(12)));
		  
		  System.out.println("al :: "+al);
		  emp_list.add(al);
		  }
		  System.out.println("Returning emp_list"+emp_list);
		  return emp_list;
	}
}
