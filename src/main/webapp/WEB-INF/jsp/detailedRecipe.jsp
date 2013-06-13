<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Recipe ${recipe.externalId}</title>
</head>
<body>

<body style="background-color:rgb(195,195,195);">

<style type="text/css">
h2
{
position:absolute;
left:425px;
top:100px;
}
</style>

<h2>
<table border ="1" align="center">
<tr>
<td width="500" align="center"><b>Lista de Receitas Detalhada</th></b>
</tr>
<form>
<tr>
<td>
<b>Título:</b>
<center><p>${recipe.title}</p></center>
</td>
</tr>
</form>
<tr>
<td>
<b>Problema:</b>
<center><p>${recipe.problem}</p></center>
 </td>
 </tr>
 <tr>
<td>
<b>Solução:</b>
<center><p>${recipe.solution}</p></center>
 </td>
 </tr>
 <tr>
<td>
<b>Autor:</b>
<center><p>${recipe.author}</p></center>
 </td>
 </tr>
 <tr>
<td>
<b>Tag:</b>
<center><p>${recipe.tag}</p></center>
 </td>
 </tr>
 <tr>
<td>
<b>Timestamp:</b>
<center><p>${recipe.creationTimestamp}</p></center>
 </td>
 </tr>
 <tr>
<td>
<center><a href="/recipes/${recipe.externalId}/delete"><input type="submit" value="Remover"></a>
<a href="/recipes/${recipe.externalId}/edit"><input type="submit" value="Editar"></a>
<a href="/recipes/"><input type="submit" value="Voltar"></center>
</tr>
</td>
</h2>

</body>
</html>