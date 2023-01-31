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
	
	
	
	public Contatos(Long id, String nome, String sobrenome, String dataNascimento, String telefone01, String telefone02, String telefone03,
			 String grauParentesco) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone01 = telefone01;
		this.telefone02 = telefone02;
		this.telefone03 = telefone03;
		this.dataNascimento = dataNascimento;
		this.grauParentesco = grauParentesco;
	}

	public Contatos(String nome, String sobrenome, String dataNascimento, String telefone01, String telefone02, String telefone03,
			 String grauParentesco) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone01 = formatarNumero(telefone01);
		this.telefone02 = formatarNumero(telefone02);
		this.telefone03 = formatarNumero(telefone03);
		this.dataNascimento = dataNascimento;
		this.grauParentesco = grauParentesco;
	}

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
		String telefone01F = telefone01.replaceAll("-","");
		return telefone01F.replaceAll("(","");
	}
	public void setTelefone01(String telefone01) {
		this.telefone01 = formatarNumero(telefone01);
	}
	public String getTelefone02() {
		String telefone02F = telefone02.replaceAll("-","");
		return telefone02F.replaceAll("(","");
	}
	public void setTelefone02(String telefone02) {
		this.telefone02 = formatarNumero(telefone02);
	}
	public String getTelefone03() {
		String telefone03F = telefone03.replaceAll("-","");
		return telefone03F.replaceAll("(","");
	}
	public void setTelefone03(String telefone03) {
		this.telefone03 = formatarNumero(telefone03);
	}
	
	public String toString(){
		return String.format("Nome: %s , Sobrenome: %s Data nascimento: %s, Telefone: %s", nome, sobrenome, dataNascimento, telefone01);
	}
	
	private String formatarNumero(String numero) {
		return numero.replaceFirst("(\\d{2})(\\d{5})(\\d+)", "($1)$2-$3");
	}
}
