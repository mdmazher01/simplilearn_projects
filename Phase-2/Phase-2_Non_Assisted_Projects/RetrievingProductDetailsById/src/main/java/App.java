

import java.sql.*;




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


	ResultSet theResultSet;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String str = request.getParameter("ID");
		try{
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/productdetails","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products where Id="+str+"");
			boolean flag = false;
			while(rs.next()) {
				
				int i = rs.getInt(1);
				String name = rs.getString(2);
				String stock = rs.getString(3);
				String price = rs.getString(4);
				flag = true;
				request.setAttribute("id",i);
				request.setAttribute("name",name);
				request.setAttribute("stock",stock);
				request.setAttribute("price",price);
				
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("servlet2");
				dispatcher.forward(request, response);
				
				break;
			}
			if(!flag) {
				out.println("Invalid ID...");
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
				dispatcher.include(request, response);

				
				
				}	
		}
		catch(SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
