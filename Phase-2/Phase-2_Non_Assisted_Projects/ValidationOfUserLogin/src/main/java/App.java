

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/App")
public class App extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		//hardcoded email and pass
		String preshared_email = "rocky@gmail.com";
		String preshared_password = "123456789";
	
		if(email.trim().equals(preshared_email) && password.trim().equals(preshared_password)) {
			out.println("<H1>Welcome to Dashboard</H1><p>");
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<FORM METHOD=\"GET\" ACTION=\"index.html\">");
			out.println("<INPUT TYPE=\"SUBMIT\" VALUE=\"logout\">");
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		}
		else {
			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<FORM METHOD=\"GET\" ACTION=\"index.html\">");
			out.println("<H1>Invalid User</H1><p>");
			out.println("<INPUT TYPE=\"SUBMIT\" VALUE=\"Try Again\">");
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		}
		out.close();
	}

}
