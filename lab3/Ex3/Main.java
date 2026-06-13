package ppp.lab3.ex3;

public class Main {

	public static void main(String[] args) {
        PagamentoCartao pagCartao = new PagamentoCartao();
        PagamentoPIX pagPIX = new PagamentoPIX();
        
        Pagamento pgtoPIX = new PagamentoPIXAdapter(pagPIX);
        Pagamento pgtoCartao = new PagamentoCartaoAdapter(pagCartao);
        
        
        pgtoPIX.pagar(150.00);
        pgtoPIX.pagar(80.50);
        pgtoCartao.pagar(100.90);
    }
}

