package heranca2_gft;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente();
		Vendedor vendedor1 = new Vendedor();
		Atendente atendente1 = new Atendente();
		
		System.out.println(gerente1.nivelAdmin);
		System.out.println(vendedor1.nivelAdmin);
		System.out.println(atendente1.nivelAdmin);
		
		vendedor1.realizarVenda();
		vendedor1.realizarVenda();
		vendedor1.realizarVenda();
		
		System.out.println(vendedor1.getQuantidadeVendas());
		
		atendente1.receberPagamento(200.00);
		atendente1.receberPagamento(150.00);
		
		System.out.printf("%.2f reais.",atendente1.fecharCaixa());
		
	}

}
