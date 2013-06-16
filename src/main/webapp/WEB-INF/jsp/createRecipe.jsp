<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<form method="POST"action="/recipes">


<body style="background-color:rgb(195,195,195);">

<style type="text/css">
h2
{
position:absolute;
left:575px;
top:200px;
}
</style>

<body>
<h2>
<table border = "1" align = "center">
<tr>
<th><p style="font-family:arial;color:white;font-size:15px;">Criar Receita</p></th>
</tr>
<tr>

<td><form method="POST"action="/recipes" align="center">

Titulo: <input type="text" name="titulo"/><br>
Problema:<input type="text" name="problema"/><br>
Solucao:<input type="text" name="solucao"/><br>
Autor<input type="text" name="autor"/><br>
Tag:<input type="text" name="tag"/><br>
<center><input type="submit" value="Criar"/>
<input type="button" value="Cancelar" onclick="javascript:location.href='/'")>
</center>
</td>
</tr>
</table>
</h2>
<body>
</form>
    


    
  