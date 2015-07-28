<%@page import="sun.font.Script"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teste JSP</title>
</head>
<body>

	<%--tags para comentários  --%>
	
	<%String mensagem = "Bem vindo ao sistema de cadastroWeb" ;%>
	
	<%out.print(mensagem); %>
	
	<br />
	
	<%String desenvolvido = "Desenvolvido por Paulo";%>
	
	<%= desenvolvido %>
	
	<br />
	
	<%System.out.println("Foi tudo executado !"); %>
	
</body>
</html>