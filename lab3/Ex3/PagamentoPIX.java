package ppp.lab3.ex3;

public class PagamentoPIX implements PagamentoPIXI{

	public void pagar(double valor) {
		System.out.println("Pagamento de R$" + valor + " realizado com sucesso! (via PIX)");
	}
}