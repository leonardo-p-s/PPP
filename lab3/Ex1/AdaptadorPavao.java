package ppp.lab3.ex1;

public class AdaptadorPavao implements Ave{
	
	private Pavao pavao;
	
	AdaptadorPavao (Pavao pavao){
		this.pavao = pavao;
	}
	
	public void emitirSom() {
		pavao.cantar();
	}
	
	public void voar() {
		System.out.println("Pavao nao voa!");
	}
}
