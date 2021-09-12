package trabalho;

public class Gerente extends Pessoa {
    public String senha;
    public double bonificacao;
	
    public Gerente(String nome, int matricula, double salario, String senha, double bonificacao) {
		super(nome, matricula, salario);
        this.senha = senha;
        this.bonificacao = bonificacao;

    }	

    public String getSenha() {
        return senha;   
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public double getBonificacao() {
        double salariobonificado = this.salario * this.bonificacao;
        
        return salariobonificado;
    }
    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }
    public double salariogeral(){
        double salariogeral = this.salario + this.getBonificacao();

        return salariogeral;
    }
}   
