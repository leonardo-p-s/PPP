package ppp.lab4.ex2;

public class CafeDecorator implements Cafe{

	protected Cafe cafe;
	
	public CafeDecorator (Cafe cafe) {
		this.cafe = cafe;
	}
	
	public String getDescricao() {
		return cafe.getDescricao();
	}
	
	public double getCusto() {
		return cafe.getCusto();
	}
	
}
