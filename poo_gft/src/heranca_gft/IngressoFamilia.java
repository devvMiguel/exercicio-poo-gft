package heranca_gft;

public class IngressoFamilia extends Ingresso {

	public double valorFamilia(int quantidade) {
		 double total = getPreco() * quantidade;

	        if (quantidade > 3) {
	            double desconto = total * 0.05; // 5% sobre o total
	            total -= desconto;
	        }

	        return total;
		
	}
}
