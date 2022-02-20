import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AppData")
public class Login_admin extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flyaway","root","");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from admin_data where id="+1+"");
		boolean flag = false;
		while(rs.next()) {
			
			int i = rs.getInt(1);
			String preshared_email = rs.getString(2);
			String preshared_password = rs.getString(3);
			
			if(email.equals(preshared_email) && password.equals(preshared_password)) {
				RequestDispatcher rd = req.getRequestDispatcher("admin_dashboard.html");
				rd.forward(req, res);
				break;
			}
			else {
				RequestDispatcher rd = req.getRequestDispatcher("index.html");
				rd.include(req, res);
				break;
			}
			
			
	}
	}catch(SQLException e) {
		out.println(e.getMessage());
	} catch (ClassNotFoundException e) {
		out.println(e.getMessage());
		
	}
}
}