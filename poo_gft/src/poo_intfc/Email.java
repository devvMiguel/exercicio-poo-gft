package poo_intfc;


public class Email implements Marketing {
	
	@Override
	public void enviarMensagem(String msg) {

		System.out.printf("%s via Email\n", msg);
		
	}

}
