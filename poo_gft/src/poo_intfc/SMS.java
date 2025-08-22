package poo_intfc;


public class SMS implements Marketing {

	@Override
	public void enviarMensagem(String msg) {

		System.out.printf("%s via Sms\n", msg);
	}

}
