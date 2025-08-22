package poo_intfc;


public class RedesSociais implements Marketing {
	
	@Override
	public void enviarMensagem(String msg) {
		System.out.printf("%s via Redes Sociais\n", msg);
		
	}

}
