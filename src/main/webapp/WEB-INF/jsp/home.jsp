<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Homepage</title>
</head>

<body>
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
left:400px;
top:45px;
}
</style>
<h2>

<table border = "0" align="center">
<tr>
<th colspan = "10"><img src= "/static/Cookbook_letring.png" width="550" height="125"></th>
</tr>

<tr>
<td><a href = "/recipes/create"><img src= "/static/Criar_Receita.png" width="100" height="50"></a></td>
<td align="center"><a href = "/recipes/${recipe.externalId}"><img src= "/static/Listar_Receitas.png" width="100" height="50"></a></td>
<td align="right"><a href = "/recipes/search"><img src= "/static/Pesquisar_Receitas.png" width="100" height="50"></a></td>
</tr>
<tr>
<td colspan ="10" align="center">
<img src="\static\cookbook.png" alt= "Big Book" width="350" height="350"></td>
</tr>
</table>
</h2>

</body>
</html>