package heranca2_gft;

public class Gerente {

	protected String nome;
	
	protected String email;
	
	protected String senha;
	
	protected boolean nivelAdmin;
	
    public Gerente() {
        this.nivelAdmin = true; 
    }
    
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean getNivelAcesso() {
		return this.nivelAdmin;
	}
	
	public void gerarRelatorio() {
		System.out.println("Gerando relatório financeiro.");
	}
	
	public void consultarVendas() {
		System.out.println("Consultando vendas.");
	}
	
	public void realizarLogin() {
		System.out.println("Logando..");
	}
	
	public void realizarLogoff() {
		System.out.println("Deslogando..");
	}
	
	public void alterarDados() {
		System.out.println("Alterando dados..");
	}
	
	public void alterarSenha() {
		System.out.println("Alterando senha.");
	}
	
}
