import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
//import java.sql.Statement;

//import javax.servlet.http.HttpSession;

public class inventory_details {
	Connection conn=null;
	PreparedStatement st1=null;
	ResultSet rs=null;
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
	public List<List<String>> search_inventory(String STB_type,String billing_type){
			ArrayList al=null;
		  ArrayList emp_list =new ArrayList();
		  String query = 
		  "select * from employee where employee_name='"+emp_name+"' or 
		   department='"+emp_dept+"' or email='"+email+"' 
		  order by employee_name";
		  System.out.println("query " + query);
		  st = conn.createStatement();
		  ResultSet  rs = st.executeQuery(query);


		  while(rs.next()){
		  al  = new ArrayList();
		  
		  al.add(rs.getString(1));
		  al.add(rs.getString(2));
		  al.add(rs.getString(3));
		  al.add(rs.getString(4));
		  al.add(rs.getString(5));
		  al.add(rs.getString(6));
		  al.add(rs.getString(7));
		  al.add(rs.getString(8));
		  al.add(rs.getString(10));
		  System.out.println("al :: "+al);
		  emp_list.add(al);
		  }

		  
	}
}
