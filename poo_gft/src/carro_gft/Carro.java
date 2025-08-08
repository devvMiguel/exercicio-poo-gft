package carro_gft;

public class Carro {
	
	//ATRIBUTOS
	
	private boolean ligado;
	
	private int velocidade;
	
	private int marcha;
	
	
	// CONSTRUTOR
	
	public Carro() {
    	this.ligado = false;
    	this.marcha = 0;
    	this.velocidade = this.marcha;
    }
	
	public boolean ligarCarro() {
		if (this.ligado != true) {
		this.ligado = true;
			System.out.println("Carro foi ligado!");
		 }
		else {
			estadoCarro();
		}
		return this.ligado;
	}
	
	public boolean desligarCarro() {
		if (this.marcha != 0) {
			System.out.println("O carro precisa estar no ponto morto.");
		}
		else {
			this.ligado = false;
			estadoCarro();
			
		}
		return this.ligado;
	}
	
	private void estadoCarro() {
		if (this.ligado == true) {
			System.out.println("O carro já está ligado..");
		}
		else {
			System.out.println("Carro está desligado.");
		}
	}
	
	public int acelerarCarro() {
		if(this.velocidade < 121) {
			this.velocidade += 1;
		} 
		else {
			System.out.println("Ja está na maior velocidade!");
		}
		return this.velocidade;
	}
	
	private int qualMarcha(int velocidade) {
		if (velocidade >= 1 && velocidade <= 20) {
			this.marcha = 1;
		}
		else if (velocidade >= 21 && velocidade <= 40) {
			this.marcha = 2;
		}
		else if (velocidade >= 41 && velocidade <= 60) {
			this.marcha = 3;
		}
		else if (velocidade >= 61 && velocidade <= 80) {
			this.marcha = 4;
		}
		else if (velocidade >= 81 && velocidade <= 100) {
			this.marcha = 5;
		}
		else {
			this.marcha = 6;
		}
		
		return this.marcha;
	}
	
	public void getVelocidade() {
		System.out.printf("Sua velocidade é de %d KM/h.", this.velocidade);
	}
	
	public void getMarcha() {
		int marcha = qualMarcha(this.velocidade);
		System.out.printf("Estou na %d marcha", marcha);
	}
	
	public int freiarCarro() {
		if (this.velocidade == 0) {
			this.marcha = 0;
			System.out.println("Está no ponto morto..");
		}
		else {
			this.velocidade -= 1;
			qualMarcha(this.velocidade);
		}
		return this.velocidade;
	}
	
	public void virarCarro(String direcao) {
		if(this.velocidade >=1 && this.velocidade <= 40) {
			System.out.printf("Virando para %s.",direcao);
		}
	}
	
}
