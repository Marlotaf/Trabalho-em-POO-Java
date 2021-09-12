package trabalho3;

public class Principal {

	public static void main(String[] args) {

        System.out.println("\nRICA");
		
		Pessoa ri = new Rica("Joao lucas", 19, 1200458, "comprar");
        System.out.println("\nNome: " + ri.nome);
        System.out.println("\nidade: " + ri.idade);
        System.out.println("\ndinheiro: " + ((Rica) ri).getMoney());
        System.out.println("\nocupacao: " + ((Rica) ri).getCompras());

        System.out.println("\nPOBRE");

        Pessoa po = new Pobre("Rodrigo Faro", 40, "trabalhar");
        System.out.println("\nNome: " + po.nome);
        System.out.println("\nidade: " + po.idade);
        System.out.println("\nocupacao: " + ((Pobre) po).getTrabalhar());

        System.out.println("\nMISERAVEL");

        Pessoa mi = new Miseravel("Jeff Bezos", 57, "mendigar");
        System.out.println("\nNome: " + mi.nome);
        System.out.println("\nidade: " + mi.idade);
        System.out.println("\nocupacao: " + ((Miseravel) mi).getMendigar());

		
	}

}