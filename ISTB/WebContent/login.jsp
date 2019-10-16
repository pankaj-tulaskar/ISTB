<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align:center; padding-top: 20;"><i style="font-size:50px;">Login</i><br><br>
<!--Login form-->
<form name="myform" action="Servlet1" method="get" style="text-align:center;">
<label for="uname"><abbr title="Username is case sensetive"><b>Username</b></abbr></label>
	&nbsp;&nbsp;&nbsp;
    <input type="text" placeholder="Enter Username" name="uname">
	<br><br>
    <label for="psw"><abbr title="Password is case sensetive"><b>Password</b></abbr></label>
	&nbsp;&nbsp;&nbsp;
    <input type="password" placeholder="Enter Password" name="psw" >
	<br>
	<label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
	<br><br>
	<button type="submit" class = "button" onclick = "return validateForm()">Login</button>
	
    <br><br>
    
</form>
<b>Not a member yet, click on Sign Up to Join Our Team.</b><br><br>
<button style="text-align:center;" type="submit" class = "button" onclick ="window.location.href='registration.html';" >Sign up</button>
</div>
</body>
</html>