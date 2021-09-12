package trabalho3;

public class Miseravel extends Pessoa {

    public String mendigar;
    
    public Miseravel(String nome, int idade, String mendigar) {
        super(nome, idade);
        this.mendigar = mendigar;
        
    }

    public String getMendigar() {
        return mendigar;
    }

    public void setMendigar(String mendigar) {
        this.mendigar = mendigar;

    }
}

   