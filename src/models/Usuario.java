package models;

public class Usuario {
	private String nome;
	private String cpf;
	private String rg; 
	private String email;
	private String telefone;
	private String endere�o;
	
	//getter e setter
	public void setNome(String nome){
		this.nome = nome;
	} 
	public String getNome(){		
		return this.nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public void setRg(String rg){
		this.rg = rg;
	} 
	public String getRg(){		
		return this.rg;
	}
	public void setEmail(String email){
		this.email = email;
	} 
	public String getEmail(){		
		return this.email;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	} 
	public String getTelefone(){		
		return this.telefone;
	}
	public void setEndere�o(String endere�o){
		this.endere�o = endere�o;
	} 
	public String getEndere�o(){		
		return this.endere�o;
	}
	
	@Override
	public String toString() {		
		return "Nome: " + getNome();
	}
}
