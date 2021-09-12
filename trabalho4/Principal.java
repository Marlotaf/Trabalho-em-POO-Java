package trabalho4;

public class Principal {

	public static void main(String[] args) {

        
		Ingresso vi = new Vip(400, 200);
        System.out.println("valor do ingresso: " + vi.valor);
        System.out.println("total com vip: " + ((Vip) vi).getAdicional());
        
        Ingresso in = new Normal(400);
        System.out.println("valor do ingresso normal: " + in.valor);


    }    
}