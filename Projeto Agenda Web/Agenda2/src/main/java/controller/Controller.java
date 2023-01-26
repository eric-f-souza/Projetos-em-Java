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

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Contatos contato = new Contatos();

	public Controller() {
		super();
	}
	
	//pega a ação feita
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Busca o nome da ação do request(solicitação) 
		String action = request.getServletPath();
		System.err.println(action);
		if(action.equals("/main")) {
			//passa os parametros do metodo para o novo metodo
			contatos(request, response);	
		}else if(action.equals("/insert")){
			novoContato(request, response);
		}else if(action.equals("/select")){
			listarContato(request, response);
		}else {
			//se nao achar nada volta para tela inicial 
			response.sendRedirect("index.html");
		}
	}
	
	// Lista contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DAO dao = new DAO();
		ArrayList<Contatos> listaContatos = dao.listaContatos();
		
		//encaminha lista para tela principal
		//seta os atribultos a serem enviados
		request.setAttribute("contatos", listaContatos);
		
		//prepara os itens setados para envir a pagina
		RequestDispatcher rd = request.getRequestDispatcher("agenda.jsp");//colocar nome do arquivo para enviar os dados
		rd.forward(request, response);//executa o envio
		}
	
	// Novo contato
	protected void novoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//teste parametros
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String dataNascimento = request.getParameter("dataNascimento");
		String telefone01 = request.getParameter("telefone01");
		String telefone02 = request.getParameter("telefone02");
		String telefone03 = request.getParameter("telefone03");
		String parentesco = request.getParameter("parentesco");

		Contatos contato = new Contatos(nome, sobrenome, dataNascimento, telefone01, telefone02, telefone03, parentesco);
		dao.add(contato);
		//Volta para agenda
		response.sendRedirect("main");//main chama a agenda
	}
		
	//editar contato
	protected void listarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//recebe o id enviado pelo <td><a href="select?id=<%=listaContatos.get(i).getId() %>" class="botao">Editar</a>
			String id = request.getParameter("id");
			contato.setId(Long.parseLong(id));
		
	}
}
