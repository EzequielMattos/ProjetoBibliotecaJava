package models;

public class Usuario {
	private String nome;
	private String cpf;
	private String rg; 
	private String email;
	private String telefone;
	private String endereco;
	
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
	public void setEndereco(String endereço){
		this.endereco = endereço;
	} 
	public String getEndereco(){		
		return this.endereco;
	}
	
	@Override
	public String toString() {		
		return "Nome: "+getNome()+" | CPF: "+getCpf()+" | Rg: "+getRg()+" | E-mail: "+getEmail()+" | Telefone: "+getTelefone()+" | Endereço: "+getEndereco();
	}
}
