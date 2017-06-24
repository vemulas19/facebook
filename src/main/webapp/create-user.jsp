<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerFacebook" method="post">
	Name : <input type="text" name="name"/></br>
	Email Id : <input type="text" name="mailId"/></br>
	Mobile : <input type="text" name="password"/></br>
	Password : <input type="password" name="repassword"/></br>
	<input type="submit" value="Register"/>
</form>


<form action="deleteIt" method="post">
Email Id : <input type="text" name="mailId"/></br>
<input type="submit" value="Delete"/>
</form>
</body>
</html>