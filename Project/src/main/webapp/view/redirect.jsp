<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%	
	if (session.getAttribute("client") != null){
		response.sendRedirect("/app/");
	}
	else if (session.getAttribute("provider") != null){
		response.sendRedirect("/app/provider");
	}
	else if (session.getAttribute("admin") != null){
		response.sendRedirect("/app/admin");
	}
	else{
		response.sendRedirect("/app/");
	}
	
%>

<!DOCTYPE html>
<html lang="el">
<head>

</head>
<body>

</body>
</html>
