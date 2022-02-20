import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Product")
public class Product extends HttpServlet{
	
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
			
			 res.setContentType("text/html");
			 
			 String product_name = req.getParameter("product_name");
			 String product_price = req.getParameter("product_price");
			 HttpSession session = req.getSession();
			 session.setAttribute("product_name", product_name);
			 session.setAttribute("product_price", product_price);
             res.sendRedirect("main.jsp");
//			 req.setAttribute("product_name", product_name);
//			 req.setAttribute("product_price", product_price);
//			 RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
//			 rd.forward(req, res);
		}

}
