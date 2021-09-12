package trabalho4;

public abstract class Ingresso {

	public double valor;
	
	public Ingresso(double valor) {
		this.valor = valor;
	}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
	
}
