<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@page import="model.Contatos"%>
<%@page import="java.util.ArrayList"%>
<%
	ArrayList<Contatos> listaContatos = (ArrayList<Contatos>) request.getAttribute("contatos");
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>Agenda Contatos</title>
<link rel="icon" href="imagens/icone_agenda.png">
<link rel="stylesheet" href="style.css">
</head>
	<body>
		<h1>Agenda Contatos</h1>
		<a href="novoContato.html" class="botao">Novo Contato</a>
		<table id="tabelaContatos">
			<thead>
				<tr>
					<th>ID</th>
					<th>Nome</th>
					<th>Sobrenome</th>
					<th>Data Nascimento</th>
					<th>Telefone</th>
					<th>Telefone Adicional</th>
					<th>Telefone Adicional</th>
					<th>Grau Parentesco</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
				<%for (int i = 0; i < listaContatos.size(); i++){ %>
					<tr>
						<td><%= listaContatos.get(i).getId()%></td>
						<td><%= listaContatos.get(i).getNome()%></td>
						<td><%= listaContatos.get(i).getSobrenome()%></td>
						<td><%= listaContatos.get(i).getDataNascimento()%></td>
						<td><%= listaContatos.get(i).getTelefone01()%></td>
						<td><%= listaContatos.get(i).getTelefone02()%></td>
						<td><%= listaContatos.get(i).getTelefone03()%></td>
						<td><%= listaContatos.get(i).getGrauParentesco()%></td>
						<td><a href="select?id=<%=listaContatos.get(i).getId() %>" class="botao">Editar</a>
					</tr>
				<%} %>
			</tbody>		
		</table>
	</body>
</html>