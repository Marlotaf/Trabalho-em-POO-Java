package trabalho3;

public class Rica extends Pessoa {

    public double money;
    public String compras;

    public Rica(String nome, int idade, double money, String compras) {
        super(nome, idade);
        this.money = money;
        this.compras = compras;

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }
    
}
