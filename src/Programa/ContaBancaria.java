package Programa;


public class ContaBancaria {
	
	private String titular;
	private String cpf; 
	private int numeroConta;
	private double saldoConta;
	private String tipoConta; 
	
	ContaBancaria(String titular,String cpf,int numeroConta,double saldoConta ,String tipoConta) {
		this.titular = titular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.tipoConta= tipoConta;
		
	}
	
	public void sacar(double valor) {  // Nomes Auto-Explicativo do que esse metodo faz 
		if  (valor >0 && valor <=saldoConta) {
			System.out.println("Saque realizado com sucesso");
			saldoConta = saldoConta - valor;
			
			System.out.printf("O saldo da sua conta é %.2f",saldoConta);
		} else {
			System.out.println("Operação invalida.\nSaldo insuficiente ou negativo");
			System.out.printf("O saldo da sua conta é %.2f",saldoConta);
		}
	}
	
	public void depositar(double valor) { // Nomes Auto-Explicativo do que esse metodo faz 
		if (valor >0) {
			saldoConta = saldoConta + valor;
			System.out.println("Valor Depositado com sucesso");
			System.out.printf("O seu saldo em conta agora é :%.2f",saldoConta);
		} else {
			System.out.println("Valor invalido ou Saldo insuficiente");
		}	
	}
	
	public void exibirDados() { // Nomes Auto-Explicativo do que esse metodo faz 
		System.out.println("\n------ Dados na conta------");
		System.out.printf("Titular da Conta: %s ",titular);
		System.out.printf("\nId Conta %d",numeroConta);
		System.out.printf("\nConta %s",tipoConta);
		System.out.printf("\nSaldo atual :%.2f ",saldoConta);
		System.out.printf("\nCPF do Titular: %s",cpf);
		System.out.println("\n------ Dados na conta------");

	}
	
	
}


