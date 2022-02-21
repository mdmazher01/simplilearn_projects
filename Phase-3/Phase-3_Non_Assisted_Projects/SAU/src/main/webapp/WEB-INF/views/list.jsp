<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
  background-color: #f2f2f2;
}
.tb{
	width: 50%;
	margin-left:300px;
	margin-top:70px;

}

.t1{
	position:relative;
	margin-left:460px;
	margin-top:70px;

}
.l{
	position:relative;
	font-size:19px;
	margin-left:590px;
}

</style>
</head>
<body>
	<div class="t1">
	<h1>List of Products</h1>
	</div>
	
		<div class="tb table-responsive">
			<table class="table table-striped table-dark table-hover table-sm">
			<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Stock</th>
				<th>Price</th>
			</tr>
			</thead>
        
        <c:forEach items="${list}" var="e">
        <tbody>
        	<tr>
				<td>${e.id}</td>
				<td>${e.name}</td>
				<td>${e.stock}</td>
				<td>${e.price}</td>	
			</tr>
        </tbody>
			
		</c:forEach>
        

		</table>
	
		
		
		</div>
		<div class="l">
		   <a href = "${pageContext.request.contextPath}/update/${e.id}" class="badge badge-primary">Edit</a>
		</div>
     
        	
		
		
</body>
</html>