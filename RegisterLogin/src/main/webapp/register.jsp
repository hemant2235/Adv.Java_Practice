<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="regForm" method="post">
		Name: <input type="text" name="name1"/><br><br>
		Email: <input type="text" name="email1"/><br><br>
		Password: <input type="password" name="pass1"/><br><br>
		Gender: <input type="radio" name="gender1" value="male"/> Male:<input type="radio" name="gender1" value="female"/><br><br>
		City: <select name="city1">
			<option>Select City</option>
			<option>Delhi</option>
			<option>Pune</option>
			<option>Mumbai</option>
			<option>Bhubneswar</option>
		</select> <br><br>
		<input type="submit" value="register"/> 
	</form>
</body>
</html>