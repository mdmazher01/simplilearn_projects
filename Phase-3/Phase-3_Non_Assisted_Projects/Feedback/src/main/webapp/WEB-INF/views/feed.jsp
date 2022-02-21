<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.container

</style>
<meta charset="ISO-8859-1">

<title>Feedback</title>
<style>

input[type=text], input[type=email],textarea {
  width: 100%; 
  padding: 12px;
  border: 1px solid #ccc; 
  border-radius: 4px;
  box-sizing: border-box; 
  margin-top: 6px;
  margin-bottom: 16px; 
  resize: vertical 
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
	<div class="container">
  <form method="post" action="/feedback">
<label for="firstname">First Name</label>
    <input type="text" id="firstname" name="firstname" placeholder="Your first name" required>
<br>
    <label for="lastname">Last Name</label>
    <input type="text" id="lastname" name="lastname" placeholder="Your last name" required>
<br>
<label for="email">Email Id</label>
    <input type="email" id="email" name="email" placeholder="Your Email Address" required>
<br>
    <label for="feedback">Feedback</label>
    <textarea id="feedback" name="feedback" placeholder="Write your feedback here..." style="height:200px" required></textarea>
<br>
    <input type="submit" value="Submit">

  </form>
  </div>
</body>
</html>