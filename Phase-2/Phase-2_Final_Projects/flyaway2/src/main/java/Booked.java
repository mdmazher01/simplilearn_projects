import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/booked")
public class Booked extends HttpServlet{
	
	PreparedStatement thePreparedStatement;
	ResultSet theResultSet;
	Connection dbCon;
	public static final String URLTOCONNECT = "jdbc:mysql://127.0.0.1:3306/flyaway";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "";
	String qry;
	static int final_price=0;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			
			PrintWriter out = res.getWriter();
			int id = Integer.parseInt(req.getParameter("number"));
			String source = req.getParameter("source");
			String destination = req.getParameter("destination");
			int seat = Integer.parseInt(req.getParameter("seat"));
			String date = req.getParameter("date");
			int aadhar = Integer.parseInt(req.getParameter("aadharnumber"));
			String name = req.getParameter("name");
			String phonenumber = req.getParameter("number2");
			
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
				qry = ("select price from add_flight where destination like '" + destination + "%" + "' and source like '" + source + "%" +"' and date like '" + date + "%" +"'");
				thePreparedStatement = dbCon.prepareStatement(qry);
				theResultSet = thePreparedStatement.executeQuery();
				
				
				while(theResultSet.next()) 
				{
					
					int price = theResultSet.getInt(1);
					final_price = seat*price;
					
					
				}
				req.setAttribute("Finalprice",final_price);
				RequestDispatcher rd = req.getRequestDispatcher("gateway.jsp");
				rd.forward(req,res);
			}
			catch(SQLException e) {
				out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			}
		}
	
	
}
