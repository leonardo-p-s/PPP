package ppp.lab4.ex3;

public class HomeTheaterFacade {
	private Amplificador amplificador;
	private Luzes luzes;
	private Pipoqueira pipoqueira;
	private Player player;
	private Projetor projetor;
	private Telao telao;
	
	public HomeTheaterFacade(Amplificador a, Luzes l, Pipoqueira p, Player pl, Projetor pr, Telao t) {
		amplificador = a;
		luzes = l;
		pipoqueira = p;
		player = pl;
		projetor = pr;
		telao = t;
	}
	public void IniciaRitualCinema() {
		pipoqueira.Ligar(); 
		pipoqueira.Arrebentar();
		luzes.Desliga();
		telao.Abaixa(); 
		projetor.Ligar(); 
		amplificador.Ligar(); 
		amplificador.SetVolume(10); 
		player.Ligar(); 
		player.PlayFilme(); 
	}
	
	public void FimDoFilme() {
		player.Desliga(); 
		amplificador.Desliga(); 
		projetor.Desliga(); 
		telao.Sobe(); 
		luzes.Ligar();
	}
}
