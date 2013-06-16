<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>

<body style="background-color:rgb(195,195,195);">

<style type="text/css">

h1{text-align:center;font-family:Arial;color:#000000;}

h2
{
position:absolute;
left:650px;
top:200px;
}
</style>

</center><h1>Resultados da Pesquisa<h1></h1></center>

<h2>
<c:forEach var="recipe" items='${recipes}'>

<a href="/recipes/${recipe.externalId} "> ${recipe.title}</a><br/>
</c:forEach>
<center><input type="button" value="Nova Pesquisa" onclick="javascript:location.href='/recipes/search'")>
<input type="button" value="Cancelar" onclick="javascript:location.href='/'")></center>
</h2>

</body>
</html>