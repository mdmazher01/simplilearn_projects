

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/delete_flight")
public class DeleteFlight extends HttpServlet{
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
		int id = Integer.parseInt(req.getParameter("id2"));
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);

			
			
			
			qry = "delete from add_flight where id=?";
	    	thePreparedStatement = dbCon.prepareStatement(qry);
			thePreparedStatement.setInt(1, id);
			int result = thePreparedStatement.executeUpdate();

			if(result >0) {
	    		out.println("Flight Deleted Successfully");
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
