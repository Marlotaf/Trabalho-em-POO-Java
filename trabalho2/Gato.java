package trabalho2;

public class Gato extends Animal{
	
	public String miada;
	
	public Gato(String nome, String raca, String miada) {
		super(nome, raca);
		
		this.miada = miada;
	}

	public String getMiada() {
		return miada;
	}

	public void setMia(String miada) {
		this.miada = miada;
	}



	
}
