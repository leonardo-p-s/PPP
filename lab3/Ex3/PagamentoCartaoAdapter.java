package ppp.lab3.ex3;

public class PagamentoCartaoAdapter implements Pagamento{
	private PagamentoCartao pagamentoCartao;
	
	public PagamentoCartaoAdapter(PagamentoCartao p) {
		this.pagamentoCartao = p;
	}
	
	public void pagar(double valor) {
		String valorStr = String.format("%.2f", valor);
		pagamentoCartao.pagar(valorStr);
	}
}
