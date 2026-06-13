package ppp.lab4.ex2;

public class Cafeteria {

	public static void main(String[] args) {
		
		Cafe latte = new Leite (new CafeEspresso());
		System.out.println(latte.getDescricao());
		System.out.println(latte.getCusto());
		
		Cafe capuccino = new Chocolate (new Leite (new Canela (new CafeEspresso())));
		System.out.println(capuccino.getDescricao());
		System.out.println(capuccino.getCusto());

	}

}
