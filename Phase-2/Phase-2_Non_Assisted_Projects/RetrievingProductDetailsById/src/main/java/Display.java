

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet2")
public class Display extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<h1>Display</h1>");
		out.println("<table><tr><th>Id</th><th>Name</th><th>Stock</th><th>Price</th></tr>");
		out.println("<tr><td>");
		out.println(request.getAttribute("id"));
		out.println("</td>");
		out.println("<td>");
		out.println(request.getAttribute("name"));
		out.println("</td>");
		out.println("<td>");
		out.println(request.getAttribute("stock"));
		out.println("</td>");
		out.println("<td>");
		out.println(request.getAttribute("price"));
		out.println("</td>");
		out.println("</tr></table>");
	}

	
}
