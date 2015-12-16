package Entry;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Homw
 */
@WebServlet("/Homw")
public class Homw extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Homw() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		String s1= request.getParameter("username");
		pw.println("<br><br><br><center>");
		pw.println(" Welcome "+s1);
		pw.println("<center/>");
		pw.println("<form name='Homepg'>");
		pw.println("Check Menu <input type='button' name='Menu' value='Check Menu'>");
		pw.println("Place order <input type='button' name='Oder' value='Place order'>");

		
	    //RequestDispatcher rd = request.getRequestDispatcher("homePage");
	    //rd.forward(request,response);		
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String water= request.getParameter("Bring_water");
		String menu= request.getParameter("Check_Menu");
		String Order= request.getParameter("Place_order");
		String Bill= request.getParameter("Give_Bill");
		
		if(water != null){
			    RequestDispatcher rd = request.getRequestDispatcher("Homw");
			    rd.forward(request,response);
		}else if(Bill != null){
			
		}else if(Order != null){
			
		}else{
			
		}
			
	}

}
