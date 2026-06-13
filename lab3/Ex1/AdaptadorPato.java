package ppp.lab3.ex1;

public class AdaptadorPato implements Ave{
	
	private Pato pato;
	
	AdaptadorPato (Pato pato){
		this.pato = pato;
	}
	
	public void emitirSom() {
		pato.grasnar();
	}
	
	public void voar() {
		pato.voar();
	}
}
