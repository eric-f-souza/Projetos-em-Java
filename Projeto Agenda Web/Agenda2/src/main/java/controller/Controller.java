package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Contatos;
import model.DAO;

//Salva o nome das requisições(actions do jsp e html)
@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select", "/update", "/delete" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Contatos contato = new Contatos();
	String msg;
	
	public Controller() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getServletPath();
		System.err.println(action);
		
		if (action.equals("/main")){
			contatos(request, response);
		} else if (action.equals("/insert")) {
			novoContato(request, response);
		} else if (action.equals("/select")) {
			listarContato(request, response);
		} else if (action.equals("/update")) {
			editarContato(request, response);
		} else if (action.equals("/delete")) {
			removerContato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DAO dao = new DAO();
		ArrayList<Contatos> listaContatos = dao.listaContatos();

		request.setAttribute("contatos", listaContatos);
		request.setAttribute("msg", msg);
		RequestDispatcher rd = request.getRequestDispatcher("agenda.jsp");
		rd.forward(request, response);
		msg = null;
	}
	
	

	
	protected void novoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String dataNascimento = request.getParameter("dataNascimento");
		String telefone01 = request.getParameter("telefone01");
		String telefone02 = request.getParameter("telefone02");
		String telefone03 = request.getParameter("telefone03");
		String parentesco = request.getParameter("parentesco");

		Contatos contato = new Contatos(nome, sobrenome, dataNascimento, telefone01, telefone02, telefone03, parentesco);
		
		if(dao.add(contato)) {
			msg = "Cliente cadastrado!";
		}else {
			msg = "Cliente não cadastrado! Tente novamente";
		}
		
		response.sendRedirect("main");

		
		
	}

	
	protected void listarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");

		contato.setId(Long.parseLong(id));

		dao.selecionarContatos(contato);


		request.setAttribute("id", contato.getId());
		request.setAttribute("nome", contato.getNome());
		request.setAttribute("sobrenome", contato.getSobrenome());
		request.setAttribute("dataNascimento", contato.getDataNascimento());
		request.setAttribute("telefone01", contato.getTelefone01());
		request.setAttribute("telefone02", contato.getTelefone02());
		request.setAttribute("telefone03", contato.getTelefone03());
		request.setAttribute("parentesco", contato.getGrauParentesco());
	
		
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}

	protected void editarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		contato.setId(Long.parseLong(request.getParameter("id")));
		contato.setNome(request.getParameter("nome"));
		contato.setSobrenome(request.getParameter("sobrenome"));
		contato.setDataNascimento(request.getParameter("dataNascimento"));
		contato.setTelefone01(request.getParameter("telefone01"));
		contato.setTelefone02(request.getParameter("telefone02"));
		contato.setTelefone03(request.getParameter("telefone03"));
		contato.setGrauParentesco(request.getParameter("parentesco"));
		
		if(dao.editarContato(contato)){
			msg = "Cliente atualizado!";
		}else {
			msg = "Alterações não foram salvas! Tente novamente";
		}

		response.sendRedirect("main");

	}
	
	protected void removerContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		contato.setId(Long.parseLong(request.getParameter("id")));
		
		if(dao.deletarContato(contato)){
			msg = "Cliente deletado!";
		}else {
			msg = "Alterações não foi deletado! Tente novamente";
		}
		
		response.sendRedirect("main");
		
	}
}
