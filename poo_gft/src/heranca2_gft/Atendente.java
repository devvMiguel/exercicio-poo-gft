package heranca2_gft;

public class Atendente extends Gerente {

	private double valorEmCaixa;
	
	public Atendente() {
		this.valorEmCaixa = 0;
        this.nivelAdmin = false; 
    }
	
	public void receberPagamento(double valor) {
		this.valorEmCaixa += valor;
	}
	
	public double fecharCaixa() {
		return this.valorEmCaixa;
	}
}
