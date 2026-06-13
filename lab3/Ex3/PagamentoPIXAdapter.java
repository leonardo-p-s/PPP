package ppp.lab3.ex3;

public class PagamentoPIXAdapter implements Pagamento{

	private PagamentoPIX pagamentoPIX;
	
	public PagamentoPIXAdapter(PagamentoPIX p) {
		this.pagamentoPIX = p;
	}
	
	public void pagar(double valor) {
		pagamentoPIX.pagar(valor);
	}
}
