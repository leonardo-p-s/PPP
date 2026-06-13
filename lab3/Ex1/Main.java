package ppp.lab3.ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato patoDomestico = new PatoDomestico();
		Pavao pavaoAzul = new PavaoAzul();
		Ave avePato = new AdaptadorPato (patoDomestico);
		Ave avePavao = new AdaptadorPavao(pavaoAzul);
		
		avePato.emitirSom();
		avePato.voar();
		avePavao.emitirSom();
		avePavao.voar();

	}
}
