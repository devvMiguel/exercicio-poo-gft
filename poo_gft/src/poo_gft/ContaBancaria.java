package poo_gft;

public class ContaBancaria {
		// ATRIBUTOS
	private double saldo;
	
	private double chequeEspecial;
	
	private double chequeUsado;

	
        //Construtorrrrr da classe
    public ContaBancaria(double valorInicial) {
    	this.saldo = valorInicial;
    	this.chequeEspecial = calcularCheque (valorInicial);
    }

 
	private double calcularCheque (double valor) { //criei este método privado, porque só vou usar dentro desta classe
		if (valor <= 500.00) {
			return 50.0;
		}
		else {
			return valor * 0.5;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}
		
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		double valorDisponivel = this.saldo + this.chequeEspecial;
		
		 if (valor <= valorDisponivel) {
		        if (valor <= this.saldo) {
		            this.saldo -= valor;
		        }
		        else {
		        	double restante = valor - this.saldo;
		        	saldo = 0;
		        	this.chequeUsado += restante;
		        }
		        
		        if (this.chequeUsado > 0) {
		        	 double taxa = this.chequeUsado * 0.2;
		             this.saldo -= taxa;
		        	
		        }
		        
		        System.out.println("Saque realizado com sucesso.");
		 }
		 else {
			 System.out.println("Saldo insuficiente na conta.");		 }
	}
	
	public void pagarBoleto(double valorBoleto) {
		double valorDisponivel = this.saldo + this.chequeEspecial;
		
		 if (valorBoleto <= valorDisponivel) {
		        if (valorBoleto <= this.saldo) {
		            this.saldo -= valorBoleto;
		        }
		        else {
		        	double restante = valorBoleto - this.saldo;
		        	saldo = 0;
		        	this.chequeUsado += restante;
		        	this.chequeEspecial -= this.chequeUsado;
		        }
		        
		        if (this.chequeUsado > 0) {
		        	 double taxa = this.chequeUsado * 0.2;
		             this.saldo -= taxa;
		        	
		        }
		        
		        System.out.println("Boleto pago com sucesso.");
		 }
		 else {
			 System.out.println("Saldo insuficiente na conta.");		 }
	}
	
	public boolean usandoChequeEspecial() {
	    return chequeUsado > 0;
	}

	
}
