package ppp.lab4.ex4;

public class Main {

	public static void main(String[] args) {
		Motor motor = new Motor();
		Farol farol = new Farol();
		CintoDeSeguranca cinto = new CintoDeSeguranca();
		Porta porta = new Porta();
		Radio radio = new Radio();
		
		CarroRituaisFacade facadeCarro = new CarroRituaisFacade(cinto, farol, motor, porta, radio);
		
		System.out.println("Executando Ritual para Dirigir");
		facadeCarro.RitualParaDirigir();
		
		System.out.println("\nExecutando Ritual ao Finalizar Corrida");
		facadeCarro.RitualFinalizarCorrida();

	}

}
