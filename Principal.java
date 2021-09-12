package trabalho;

public class Principal {
    public static void main(String[] args) {

        Funcionario i = new Funcionario ("Enio", 456789, 1100);
        System.out.println("\nNome: " + i.nome);
        System.out.println("\nmatricula: " + i.matricula);
        System.out.println("\nsalario: " + i.salario);

        Gerente g = new Gerente ("Roberto", 578932, 1100, "Programador_safadao123", 0.10);
        System.out.println("\nNome: " + g.nome);
        System.out.println("\nmatricula: " + g.matricula);
        System.out.println("\nsalario: " + g.salario);
        System.out.println("\nsenha: " + g.senha);
        System.out.println("\nsalario total com bonificacao: " + g.salariogeral());
        System.out.println("\n");


        }

        
   
    }
    
