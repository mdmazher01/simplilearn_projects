import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AppData2")
public class forget_password extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String reset_email = req.getParameter("email");
		String reset_password = req.getParameter("password");
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flyaway","root","");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("update admin_data set email='"+reset_email+"', password='"+reset_password+"' where id='"+1+"'");
			if(result >0) {
	    		out.println("Email and Password Change Successfully");
	    		out.println("<HTML>");
				out.println("<BODY>");
				out.println("<FORM METHOD=\"GET\" ACTION=\"admin_login_data.html\">");
			
				out.println("<INPUT TYPE=\"SUBMIT\" VALUE=\"Login again\">");
				out.println("</FORM>");
				out.println("</BODY>");
				out.println("</HTML>");
	    	}
			
				
		}
		catch(SQLException e) {
			out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			out.println(e.getMessage());
			
		}
		
		
	}
}
