<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Display</h1>
	<div class="display">
	 <%
      out.println("<h4>Flight Id:"+request.getParameter("number")+"</h4>");
      out.println("<h4>Source:"+request.getParameter("source")+"</h4>");
      out.println("<h4>Destination:"+request.getParameter("destination")+"</h4>");
      out.println("<h4>Number of Seats:"+request.getParameter("seat")+"</h4>");
      out.println("<h4>Date:"+request.getParameter("date")+"</h4>");
      out.println("<h4>Aadhar Number:"+request.getParameter("aadharnumber")+"</h4>");
      out.println("<h4>Name:"+request.getParameter("name")+"</h4>");
      out.println("<h4>PhoneNumber:"+request.getParameter("number2")+"</h4>");
      out.println("<h2>Price</h2>");
      int i = Integer.parseInt(request.getParameter("seat")) ;
      int j = Integer.parseInt(request.getAttribute("Finalprice").toString()) ;
      out.println("<h3>Rupees :"+i*j+"</h3>"); 
      %>
	</div>
<form action="gateway2.html">
	<button>Make Payment</button>
</form>
</body>
</html>