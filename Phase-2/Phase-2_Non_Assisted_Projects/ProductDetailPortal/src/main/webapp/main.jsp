<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body>
	<h1>Display</h1>
      <ul>
         <li><p><b>Product Name:</b>
            <%= session.getAttribute("product_name")%>
         </p></li>
         <li><p><b>Product Price in Rupees:</b>
            <%= session.getAttribute("product_price")%>
         </p></li>
      </ul>
</body>
</html>