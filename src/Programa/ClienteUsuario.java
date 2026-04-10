package Programa;

public class ClienteUsuario {
	
	
	private static int numeracao = 1;
	
	
	private String nome;
	private String cpf;
	private String email;
	
	public ClienteUsuario(String nome,String cpf,String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	
		

}
