<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Secure-Welcome-page</title>
	</head>
	<body>
		<H1>Welcome ${name}</H1>
		
		Hi ${name}. You have successfully logged in 
		
		<A href="/secure/logout">Click here</A> to logout.
	</body>
</html>