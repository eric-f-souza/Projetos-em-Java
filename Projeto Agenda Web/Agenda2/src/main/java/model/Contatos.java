package model;

public class Contatos {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String telefone01;
	private String telefone02;
	private String telefone03;
	private String dataNascimento;
	private String grauParentesco;
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public Contatos() {
	
	}
	
	public Contatos(Long id, String nome, String sobrenome, String email, String telefone01) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = email;
		this.telefone01 = telefone01;
		
	}
	
	public Contatos(Long id, String nome, String sobrenome, String email, String telefone01, String telefone02) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = email;
		this.telefone01 = telefone01;
		this.telefone02 = telefone02;
	}
	
	public Contatos(Long id, String nome, String sobrenome, String email, String telefone01, String telefone02, String telefone03) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = email;
		this.telefone01 = telefone01;
		this.telefone02 = telefone02;
		this.telefone03 = telefone03;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone01() {
		return telefone01;
	}
	public void setTelefone01(String telefone01) {
		this.telefone01 = telefone01;
	}
	public String getTelefone02() {
		return telefone02;
	}
	public void setTelefone02(String telefone02) {
		this.telefone02 = telefone02;
	}
	public String getTelefone03() {
		return telefone03;
	}
	public void setTelefone03(String telefone03) {
		this.telefone03 = telefone03;
	}
	public String getEmail() {
		return dataNascimento;
	}
	public void setEmail(String email) {
		this.dataNascimento = email;
	}
	
}
