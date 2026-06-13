package ppp.lab4.ex2;

public class Chocolate extends CafeDecorator{
	
	public Chocolate(Cafe cafe) {
		super(cafe);
	}
	public String getDescricao() {
		String descricaoSemChocolate = super.getDescricao();
		return descricaoSemChocolate + " Chocolate";
	}
	
	public double getCusto() {
		double custoSemChocolate = super.getCusto();
		return custoSemChocolate + 6.0;
	}

}
