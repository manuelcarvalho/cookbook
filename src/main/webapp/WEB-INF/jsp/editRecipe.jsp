<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<body style="background-color:rgb(195,195,195);">


<body style="background-color:rgb(195,195,195);">

<style type="text/css">
.box{
display:table-cell;
text-align:center;
vertical-align:middle;
}
.box*{
vertical-align:middle;
}

h2
{
position:absolute;
left:550px;
top:175px;
}
</style>

<center><h1>Editar Receitas</h1></center>

<h2>
<form method="POST"action="/recipes/${recipe.externalId}">

Título: <input type="text" name="titulo" value = "${recipe.title}"/><br>
Problema: <input type="text" name="problema" value = "${recipe.problem}"/><br>
Solução: <input type="text" name="solucao" value = "${recipe.solution}"/><br>
Autor: <input type="text" name="autor" value = "${recipe.author}"/><br>
Tag: <input type="text" name="tag" value = "${recipe.tag}"/><br>
<center><input type="submit" value="Editar Receita" />
<input type="button" value="Cancelar" onclick="javascript:location.href='/recipes/'")></center>
</h2>
</form>
    