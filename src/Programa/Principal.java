package Programa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Sistema Bancario Java-Teste");
		ContaBancaria PrimeiraConta = new ContaBancaria("Miguel", "12345670", 1, 0, "Corrente");
		
		int opcao = 0;
		while (opcao !=4) {
			System.out.println("\nDigite a opção que deseja selecionar");
			System.out.println("1 - Depositar \n2 - Sacar\n3 - Ver Extrato\n4 - Sair ");
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Quanto de Saldo deseja Depositar? ");
				double valorDeposito = leitor.nextDouble();
				PrimeiraConta.depositar(valorDeposito);
				break;
			case 2:
				System.out.println("Quanto de Saldo desejar Sacar? ");
				double valorSaque = leitor.nextDouble();
				PrimeiraConta.sacar(valorSaque);
				break;
			case 3:
				PrimeiraConta.exibirDados();
				break;
			case 4:
				System.out.println("Saindo do Programa...");
				break;
			default:
				System.out.println("Opção Invalida");
			}
			
		}
	
		leitor.close();
		
	}

}
