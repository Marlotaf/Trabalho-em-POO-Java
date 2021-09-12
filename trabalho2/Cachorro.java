package trabalho2;

public class Cachorro extends Animal{
	
	public String latido;
	
	public Cachorro(String nome, String raca, String latido) {
		super(nome, raca);
		
		this.latido = latido;
	}

	public String getLatido() {
		return latido;
	}

	public void setLate(String latido) {
		this.latido = latido;
	}
	


}
