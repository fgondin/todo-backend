<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="service.TarefaService"%>
<%@ page import="java.util.List"%>
<%@ page import="model.Tarefa" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	<body>
	
	<h1>Tarefas</h1>
		<%
		    TarefaService service = new TarefaService();
		    List<Tarefa> lista = service.listarTarefas();
		
		    for (Tarefa tarefa : lista) {
		%>
		    <div class="tarefa">
		        <%= tarefa.getDescricao() %>
		    </div>
		<%
		    }
		%>

	
	</body>
</html>