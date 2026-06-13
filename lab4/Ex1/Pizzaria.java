package ppp.lab4.ex1;

public class Pizzaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza marguerita = new Tomate (new Queijo (new MassaFinaPizza()));
		System.out.println(marguerita.getDescricao());
		System.out.println(marguerita.getCusto());
		
		Pizza portuguesa = new Queijo (new Ovo (new Tomate (new MassaEspessaPizza())));
		System.out.println(portuguesa.getDescricao());
		System.out.println(portuguesa.getCusto());

	}

}
