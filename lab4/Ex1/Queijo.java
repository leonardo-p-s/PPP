package ppp.lab4.ex1;

public class Queijo extends PizzaDecorator{
	
	public Queijo(Pizza pizza) {
		super(pizza);
	}
	public String getDescricao() {
		String descricaoSemQueijo = super.getDescricao();
		return descricaoSemQueijo + " queijo";
	}
	
	public double getCusto() {
		double custoSemQueijo = super.getCusto();
		return custoSemQueijo + 25.0;
	}
}
