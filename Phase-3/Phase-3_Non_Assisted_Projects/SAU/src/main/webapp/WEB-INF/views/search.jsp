<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Add Data</title>
<style type="text/css">

body{
  background-color: #f2f2f2;
}

.container{
	position:fixed;
}

.frm2{
	position:relative;
	left:440px;
	top:200px;
}

.t1{
	position:relative;
	left:550px;
	top:120px;
}

.msg{
	position:relative;
	left:450px;
	top:170px;

}

.t2{
	font-size:18px;
	font-weight: bold;

}

.sb{
	position:relative;
	left:280px;
	bottom:40px;

}
</style>
</head>
<body>
		<div class="container">
			<div class="t1">
				<h1>Search</h1>
			</div>
			<div class="msg">
				<c:if test="${not empty error}">
			        Error: ${error}
				</c:if>
				<c:if test="${!status}">
				 	<c:out value = "${status}"/>
				</c:if>
				
				<c:if test="${statuss}">
				 	<c:out value = "${statuss}"/>
				</c:if>
			
			</div>	
			
			
			<div class="frm">
				
				<div class="frm2">
					<form action="search" method="post">
					<label class="t2">Enter Id:</label>
					<input type="number" name="id" class="in">
					<div class="sb">
						<input type="submit" class="btn btn-primary">
					</div>
					
					</form>
				</div>
				
			
			</div>
			
		
		</div>
	






</body>
</html>