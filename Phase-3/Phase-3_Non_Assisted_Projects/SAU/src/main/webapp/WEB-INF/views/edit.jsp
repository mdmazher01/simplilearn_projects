<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Update</title>
<style type="text/css">
body{
  background-color: #f2f2f2;
}

.frm{
	width: 30%;
	margin-left:450px;
	margin-top:50px;
}

</style>
</head>
<body>

	<div class="frm">
		<form action="/update" method="post">
			  <div class="form-group">
			    <label for="Id">Enter ID</label>
			    <input type="number" class="form-control" name="id"  placeholder="Enter Id">
			  </div>
			  
			  <div class="form-group">
			    <label for="name">Enter Name</label>
			    <input type="text" class="form-control" name="name" placeholder="Name">
			  </div>
			  
			  <div class="form-group">
			    <label for="stock">Enter Stock</label>
			    <input type="number" class="form-control" name="stock" placeholder="Stock">
			  </div>
			  
			  
			   <div class="form-group">
			    <label for="price">Enter Price</label>
			    <input type="number" class="form-control" name="price" placeholder="Price">
			  </div>
			   
  
  				<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	
	</div>
	

</body>
</html>