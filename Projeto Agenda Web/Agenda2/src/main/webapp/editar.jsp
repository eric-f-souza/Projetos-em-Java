<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Agenda Telefônica</title>
<link rel="icon" href="imagens/icone_agenda.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar Contato</h1>
	<form name="frmNovoContato" action="">
		<table>
			<tr>
				<td><input type="text" name="id" id="tipoTexto3" readonly value="<%out.print(request.getAttribute("id")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="tipoTexto1" value="<%out.print(request.getAttribute("nome")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="sobrenome" class="tipoTexto1" value="<%out.print(request.getAttribute("sobrenome")); %>"></td>
			</tr>
			<tr>
				<td><input type="date" name="dataNascimento" class="tipoTexto2" value="<%out.print(request.getAttribute("dataNescimento")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="telefone01" class="tipoTexto2" value="<%out.print(request.getAttribute("telefone01")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="telefone02" class="tipoTexto2" value="<%out.print(request.getAttribute("telefone02")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="telefone03" class="tipoTexto2" value="<%out.print(request.getAttribute("telefone03")); %>"></td>
			</tr>
			<tr>
				<td><input type="text" name="parentesco" class="tipoTexto2" value="<%out.print(request.getAttribute("parentesco")); %>"></td>
			</tr>
		</table>
		<input class="botao" type="button" value="Adicionar Contato"
			onclick="validar()">
	</form>
	<script src="scripts/validador.js"></script>
</body>
</html>