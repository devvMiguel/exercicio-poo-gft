package poo_gft;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria(500.00);
		
		System.out.println("*****************************************************");
	    System.out.println("                                                     ");
	    System.out.println("                BANCO DO BRAZIL COM Z                ");
	    System.out.println("                                                     ");
	    System.out.println("*****************************************************");
	    System.out.println("                                                     ");
	    System.out.println("            1 - Consultar Saldo                      ");
	    System.out.println("            2 - Consultar cheque especial            ");
	    System.out.println("            3 - Depositar dinheiro                   ");
	    System.out.println("            4 - Sacar dinheiro                       ");
	    System.out.println("            5 - Pagar um boleto                      ");
	    System.out.println("            6 - Verificar se está usando o cheque    ");
	    System.out.println("            0 - Sair                                 ");
	    System.out.println("                                                     ");
	    System.out.println("*****************************************************");

	    System.out.println("Digite uma opção:");
	   
	    int option;
	    
	    do {
	    	option = sc.nextInt();
	    	switch(option) {
	    			case 1:
	    				System.out.printf("Saldo: R$ %.2f%n", conta.getSaldo());
	    			    break;
	    			case 2:
	    				System.out.printf("Cheque especial: %.2f%n", conta.getChequeEspecial());
	    				break;
	    			case 3:
	    				System.out.println("Qual o valor do depósito: ");
	    				double valorDeposito = sc.nextDouble();
	    				conta.depositar(valorDeposito);
	    				System.out.println("Depósito realizado com sucesso.");
	    				break;
	    			case 4:
	    				System.out.println("Qual o valor do saque:");
	    				double valorSaque = sc.nextDouble();
	    				conta.sacar(valorSaque);
	    				break;
	    			case 5:
	    				System.out.println("Qual o valor do boleto?");
	    				double valorBoleto = sc.nextDouble();
	    				conta.pagarBoleto(valorBoleto);
	    				break;
	    			case 6:
	    				if (conta.usandoChequeEspecial()) {
	    					System.out.println("Você está usando o cheque especial.");
	    				}
	    				else {
	    					System.out.println("Você não está usando o cheque especial.");
	    				}
	    				break;
	    			default: 
	    				if (option != 0)System.out.println("Opção inválida. Tente novamente.");	
	    	}
	    }
	    while(option != 0);
    	System.out.println("Obrigado por utilizar nosso banco.");
	    sc.close();
	}
}
