package trabalho2;

public abstract class Animal {
	public String nome;
	public String raca;
	
	public Animal(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
}
