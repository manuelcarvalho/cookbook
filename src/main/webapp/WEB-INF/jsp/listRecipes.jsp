<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recipes List</title>
</head>
<body>

<body>

<body style="background-color:rgb(195,195,195);">

<style type="text/css">

h1{text-align:center;font-family:Arial;color:#000000;}

h2
{
position:absolute;
left:515px;
top:200px;
}
</style>

<h1>Lista de Receitas</h1>

<h2>
<form>

<c:forEach var="recipe" items='${recipes}'>

Titulo:${recipe.title}
Autor:${recipe.author}
Tag:${recipe.tag}

<input type="button" value="Detalhes" onclick="location.href='/recipes/${recipe.externalId}'">
<a href ="/recipes/${recipe.externalId}/edit"><input type="button" value="Editar"></a>
<a href= "/recipes/${recipe.externalId}/delete" ><input type="button" value="Remover"></a><br>

</c:forEach>
<input type="button" value="Voltar" onclick="javascript:location.href='/'")>
</body>
</html>