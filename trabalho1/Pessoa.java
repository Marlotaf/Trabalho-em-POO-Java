package trabalho;

public class Pessoa {
	public String nome;
    public int matricula;
	public double salario;

	public Pessoa(String nome, int matricula, double salario) {
		this.nome = nome;
		this.matricula = matricula;
		this.salario = salario;
        
	}   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

