package ppp.lab4.ex4;

public class CarroRituaisFacade {
	private CintoDeSeguranca cinto;
	private Farol farol;
	private Motor motor;
	private Porta porta;
	private Radio radio;
	
	public CarroRituaisFacade(CintoDeSeguranca ct, Farol fr, Motor mt, Porta pt, Radio rd) {
		this.cinto = ct;
		this.farol = fr;
		this.motor = mt;
		this.porta = pt;
		this.radio = rd;
	}
	
	public void RitualParaDirigir() {
		motor.Ligar();
		porta.Trancar(); 
		cinto.Travar(); 
		farol.Acender(); 
		radio.Ligar(); 
		radio.SintonizarFav(); 
	}
	
	public void RitualFinalizarCorrida() {
		motor.Desligar();
		porta.Destrancar(); 
		cinto.Destravar(); 
		farol.Apagar(); 
		radio.Desligar(); 
	}
}
