package poo_intfc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SMS phoneSms = new SMS();
		Whatsapp phoneWhatsapp = new Whatsapp();
		Email phoneEmail = new Email();
		RedesSociais phoneRedesSociais = new RedesSociais();
		
		int option = -1;
		
		do {
			System.out.println("ESCOLHA POR QUAL CANAL QUER TRANSMITIR A MENSAGEM");
			System.out.println("==================================================");
			System.out.println("1 - Transmitir mensagem via SMS.");
			System.out.println("2 - Transmitir mensagem via Whatsapp.");
			System.out.println("3 - Transmitir mensagem via E-mail.");
			System.out.println("4 - Transmitir mensagem via Redes Sociais.");
			System.out.println("5 - Sair do programa");
			System.out.println("==================================================");
			System.out.println("Selecione sua opção:");
			option = sc.nextInt();
			
			switch(option) {
				case 1 -> {
					phoneSms.enviarMensagem("Contratado");
				}
				case 2 -> {
					phoneWhatsapp.enviarMensagem("Contratado");
				}
				case 3 -> {
					phoneEmail.enviarMensagem("Contratado");
				}
				case 4 -> {
					phoneRedesSociais.enviarMensagem("Contratado");
				}
				default -> {
					if(option != 5) {
						System.out.println("Opção inválida, tente outro número.");
					}
					else {
						break;
					}
				}
			}
		}
		while (option != 5);
		
			sc.close();
	}

}
