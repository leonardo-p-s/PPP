package ppp.lab4.ex2;

public class Canela extends CafeDecorator{
	
	public Canela(Cafe cafe) {
		super(cafe);
	}
	public String getDescricao() {
		String descricaoSemCanela = super.getDescricao();
		return descricaoSemCanela + " Canela";
	}
	
	public double getCusto() {
		double custoSemCanela = super.getCusto();
		return custoSemCanela + 5.0;
	}
}
