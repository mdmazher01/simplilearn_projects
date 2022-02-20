import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/add_flight")
public class AddFlight extends HttpServlet{
	PreparedStatement thePreparedStatement;
	ResultSet theResultSet;
	Connection dbCon;
	public static final String URLTOCONNECT = "jdbc:mysql://127.0.0.1:3306/flyaway";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "";
	String qry;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		int id = Integer.parseInt(req.getParameter("id"));
		String date = req.getParameter("date");
		String source = req.getParameter("source");
		String destination = req.getParameter("destination");
		int seat = Integer.parseInt(req.getParameter("seat"));
		int price = Integer.parseInt(req.getParameter("price"));
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);

			
			
			
			qry = "insert into add_flight (id,date,source,destination,seat,price) values (?,?,?,?,?,?)";
	    	thePreparedStatement = dbCon.prepareStatement(qry);
			thePreparedStatement.setInt(1, id);
			thePreparedStatement.setString(2, date);
			thePreparedStatement.setString(3, source);
			thePreparedStatement.setString(4, destination);
			thePreparedStatement.setInt(5, seat);
			thePreparedStatement.setInt(6, price);
			int result = thePreparedStatement.executeUpdate();

			if(result >0) {
	    		out.println("Flight Added Successfully");
	    		out.println("<HTML>");
				out.println("<BODY>");
				out.println("<FORM METHOD=\"GET\" ACTION=\"admin_dashboard.html\">");
			
				out.println("<INPUT TYPE=\"SUBMIT\" VALUE=\"Back to Dashboard\">");
				out.println("</FORM>");
				out.println("</BODY>");
				out.println("</HTML>");
	    	}
			
				
		}
		catch(SQLException e) {
			out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	
		
		
	}
	
}
