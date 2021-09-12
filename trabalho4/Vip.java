package trabalho4;

public class Vip extends Ingresso {

    public double total;

    public Vip(double valor, double total) {
        super(valor);
        this.total = total;
    
    }

    public double getAdicional() {
        return total + valor;
    }

    public void setAdicional(double total) {
        this.total = total;
    }
    
}
