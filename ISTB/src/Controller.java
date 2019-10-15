

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String billType=request.getParameter("billType");
		//String stbType=request.getParameter("stbType");
		//HttpSession session=request.getSession();
		int cust_id=702;
		inventory_details sp= new inventory_details();
		System.out.println("logic object created");
		try {
			System.out.println("entered try block");
			if(sp.check(cust_id)) {
				System.out.println("if block");
				List<List<String>> emp_list;
				emp_list=sp.search_inventory(request.getParameter("stbType"),request.getParameter("billType"));
				request.setAttribute("empList",emp_list);
				getServletContext().getRequestDispatcher("/ViewSearch.jsp").forward(request, response);
			}
			else {
				System.out.println("else block");
				getServletContext().getRequestDispatcher("/Error.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
