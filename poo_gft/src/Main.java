import heranca_gft.IngressoFamilia;
import heranca_gft.IngressoMeia;

public class Main {

	public static void main(String[] args) {

		
		IngressoMeia ingresso1 = new IngressoMeia();
		IngressoFamilia ingresso2 = new IngressoFamilia();
		
		ingresso1.setPreco(25);
		ingresso1.setAudio("Dublado");
		ingresso1.setNomeFilme("A volta dos que não foram");
		
		
		System.out.printf("Valor do seu ingresso ficou: %.2f. \n",ingresso1.valorMeia());
		System.out.println("O filme é " + ingresso1.getAudio());
		System.out.println("E o nome do filme é " + ingresso1.getNomeFilme()+"\n");

		ingresso2.setPreco(25);
		ingresso2.setAudio("Dublado");
		ingresso2.setNomeFilme("A volta dos que não foram");
		
		
		System.out.printf("Valor do seu ingresso ficou: %.2f. \n",ingresso2.valorFamilia(4));
		System.out.println("O filme é " + ingresso2.getAudio());
		System.out.println("E o nome do filme é " + ingresso2.getNomeFilme()+"\n");
		
		
	}
}