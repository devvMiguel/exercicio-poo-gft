package heranca2_gft;

public class Vendedor extends Gerente {
	
	private int quantidadeVendas;
	
	public Vendedor() {
		this.quantidadeVendas = 0;
        this.nivelAdmin = false; 
    }
	
	public void realizarVenda () {
		this.quantidadeVendas += 1;
		System.out.println("Venda realizada.");
	}
	
	public int getQuantidadeVendas() {
		return this.quantidadeVendas;
	}
	
}
