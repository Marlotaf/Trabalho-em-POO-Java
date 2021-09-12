package trabalho3;

public class Pobre extends Pessoa {
    
    public String trabalhar;

    public Pobre(String nome, int idade, String trabalhar) {
        super(nome, idade);
        this.trabalhar = trabalhar;

    }

    public String getTrabalhar() {
        return trabalhar;
    }

    public void setTrabalhar(String trabalhar) {
        this.trabalhar = trabalhar;

    }
}

   