package carro_gft;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		
		System.out.println("*****************************************************");
	    System.out.println("                                                     ");
	    System.out.println("                BANCO DO BRAZIL COM Z                ");
	    System.out.println("                                                     ");
	    System.out.println("*****************************************************");
	    System.out.println("                                                     ");
	    System.out.println("            1 - Ligar Carro                          ");
	    System.out.println("            2 - Acelerar Carro                       ");
	    System.out.println("            3 - Freiar Carro                         ");
	    System.out.println("            4 - Qual marcha estou?                   ");
	    System.out.println("            5 - Virar direção do carro               ");
	    System.out.println("            6 - Qual minha velocidade atual?         ");
	    System.out.println("            0 - Sair                                 ");
	    System.out.println("                                                     ");
	    System.out.println("*****************************************************");

	    System.out.println("Digite uma opção:");
	   
	    int option;
	    
	    do {
	    	option = sc.nextInt();
	    	sc.nextLine();
	    	switch(option) {
	    			case 1:
	    				carro1.ligarCarro();
	    				break;
	    			
	    			case 2:
	    				carro1.acelerarCarro();
	    				break;
	    				
	    			case 3:
	    				carro1.freiarCarro();
	    				break;
	    				
	    			case 4:
	    				carro1.getMarcha();
	    				break;
	    				
	    			case 5:
	    				System.out.println("Qual direção? (Esquerda ou direita?");
	    				String direcao = sc.nextLine();
	    				carro1.virarCarro(direcao);
	    				break;
	    				
	    			case 6:
	    				carro1.getVelocidade();
	    			default: 
	    				if (option < 0 && option > 6)System.out.println("Opção inválida. Tente novamente.");	
	    	}
	    }
	    while(option != 0);
	    sc.close();
	}
}