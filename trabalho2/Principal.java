package trabalho2;

public class Principal {

	public static void main(String[] args) {

        System.out.println("\nGATO");
		
		Animal cat = new Gato("Merlin", "Sphynx","mew mew mew");
        System.out.println("\nNome: " + cat.nome);
        System.out.println("\nRaca: " + cat.raca);
        System.out.println("\nmiada: " + ((Gato) cat).getMiada());

        System.out.println("\nCACHORRO");
    
		Animal dog = new Cachorro("Woody", "Shiba inu","au au au");
        System.out.println("\nNome: " + dog.nome);
        System.out.println("\nRaca: " + dog.raca);
        System.out.println("\nlatido: " + ((Cachorro) dog).getLatido());
    
		
	}

}