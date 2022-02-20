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


@WebServlet("/search_flight")
public class SearchFlight extends HttpServlet{
	
	PreparedStatement thePreparedStatement;
	ResultSet theResultSet;
	Connection dbCon;
	public static final String URLTOCONNECT = "jdbc:mysql://127.0.0.1:3306/flyaway";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "";
	String qry;
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		 out.println("<html><body><head><style> table,th,td {border: 1px solid black} th,td {padding:10px}</style></head>");  	
		 String source1 = req.getParameter("source");
		 String destination2 = req.getParameter("destination");
		 String date2 = req.getParameter("date");
		 
		 try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
				qry = ("select * from add_flight where destination like '" + destination2 + "%" + "' and source like '" + source1 + "%" +"' and date like '" + date2 + "%" +"'");
				thePreparedStatement = dbCon.prepareStatement(qry);
				theResultSet = thePreparedStatement.executeQuery();
				
				out.println("<h1>Available Flight</h1>");
				out.println("<table><tr><th>Id</th><th>Date</th><th>Source</th><th>Destination</th><th>Seat</th><th>Price</th></tr>");
			
				
				while(theResultSet.next()) 
				{
					
					int id = theResultSet.getInt(1);
					String date = theResultSet.getString(2);
					String source = theResultSet.getString(3);
					String destination = theResultSet.getString(4);
					int seat = theResultSet.getInt(5);
					int price = theResultSet.getInt(6);
					
					
					//out.println("<tr><td>" + id + "</td><td>" + date + "</td><td>" + source + "</td></tr>" + "<tr><td>" + destination + "</td><td>" + seat + "</td><td>" + price + "</td></tr>");   
					out.println("<tr><td>");
					out.println(id);
					out.println("</td>");
					out.println("<td>");
					out.println(date);
					out.println("</td>");
					out.println("<td>");
					out.println(source);
					out.println("</td>");
					out.println("<td>");
					out.println(destination);
					out.println("</td>");
					out.println("<td>");
					out.println(seat);
					out.println("</td>");
					out.println("<td>");
					out.println(price);
					out.println("</td></tr>");
					
				}
				out.println("</table>");  
	            out.println("</html></body>");  
	            dbCon.close();  
	           
	    		out.println("<HTML>");
				out.println("<BODY>");
				out.println("<FORM METHOD=\"GET\" ACTION=\"customer2.html\">");
			
				out.println("<INPUT TYPE=\"SUBMIT\" VALUE=\"Back to Book Flight\">");
				out.println("</FORM>");
				out.println("</BODY>");
				out.println("</HTML>");
			
			}
			catch(SQLException e) {
				out.println(e.getMessage());
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			}
		 
		 
		 
	}
}
