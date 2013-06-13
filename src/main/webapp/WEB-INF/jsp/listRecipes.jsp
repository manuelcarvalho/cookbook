<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recipes List</title>
</head>
<body>


<body style="background-color:rgb(195,195,195);">
</head>
<body>
<h1>Lista de Receitas</h1>

<br>
<input type="button" value="Voltar" onclick="javascript:location.href='/'")>

<table align="center" border="0" bordercolor="#FFCC00"  width="50%" cellpadding="0" cellspacing="10">


<c:forEach var="recipe" items='${recipes}'>
	<tr>
		<td>
			<h4>${recipe.title}:</h4>
		</td>
		<td>
			<input type="button" value="Detalhes" onclick="location.href='/recipes/${recipe.externalId}'">
			<a href="/recipes/${recipe.externalId}/delete"><input type="button" value="Remover"></a>
			</td>
	</tr>
			
</c:forEach>
</table>


</body>
</html>
