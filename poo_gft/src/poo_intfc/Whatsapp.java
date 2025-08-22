package poo_intfc;


public class Whatsapp implements Marketing {
	
	@Override
	public void enviarMensagem(String msg) {

		System.out.printf("%s via Whatsapp\n", msg);
		
	}

}
