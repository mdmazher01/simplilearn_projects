

import jakarta.servlet.http.HttpServlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Map;

import javax.net.ssl.ManagerFactoryParameters;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/App")
public class App extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		SessionFactory factory = new Configuration().configure("hibernate1.cfg.xml").addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session theSession = factory.getCurrentSession();
		
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String stock = request.getParameter("stock");
		String price = request.getParameter("price");
		
		if(name.isEmpty() || stock.isEmpty() || price.isEmpty()) {

			out.println("<HTML>");
			out.println("<BODY>");
			out.println("<FORM METHOD=\"GET\" ACTION=\"index.jsp\">");
			out.println("<H1>Fields cannot be empty</H1><p>");
			out.println("<INPUT TYPE=\"SUBMIT\" VALUE=\"Go Back\">");
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		}
		else {
			try {
				
				
				User theuser = new User(name, stock, price);
				Session s = FactoryProvider.getFactory().openSession();
				Transaction tx = s.beginTransaction();
				s.save(theuser);
				tx.commit();
				s.close();
				out.println("<h1>Added Succesfully</h1>");	
				
		
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			if(e.getMessage()=="could not execute statement") {
				out.println("Product is Already Present in DataBase");
			}
			
			
		}
		
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
