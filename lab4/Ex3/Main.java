package ppp.lab4.ex3;

public class Main {

	public static void main(String[] args) {
		Amplificador amp = new Amplificador();
		Luzes lz = new Luzes();
		Pipoqueira pp = new Pipoqueira();
		Player pl = new Player();
		Projetor pr = new Projetor();
		Telao tl = new Telao();
		
		HomeTheaterFacade cinemateca = new HomeTheaterFacade(amp, lz, pp, pl, pr, tl);
		
		System.out.println("a) Iniciando Ritual Cinemateca");
		cinemateca.IniciaRitualCinema();
		
		System.out.println("\nb) Finalizando Ritual Cinemateca");
		cinemateca.FimDoFilme();

	}
}
