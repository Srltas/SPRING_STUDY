<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Error</title>
	</head>
	<body>
		<h1>Error Page</h1>
		
		URL: ${url}
		
		<BR />
		Exception: ${exception.message}
		
		<c:forEach items="${exception.stackTrace}" var="exceptionStackTrace">    
				${exceptionStackTrace} 
		</c:forEach>
	</body>
</html>