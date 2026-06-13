package ppp.lab4.ex2;

public class Leite extends CafeDecorator{
	
	public Leite(Cafe cafe) {
		super(cafe);
	}
	public String getDescricao() {
		String descricaoSemLeite = super.getDescricao();
		return descricaoSemLeite + " Leite";
	}
	
	public double getCusto() {
		double custoSemLeite = super.getCusto();
		return custoSemLeite + 7.0;
	}
}
