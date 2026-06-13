package ppp.lab3.ex4;

//Objeto base (CameraReal) - conecta de fato
public class CameraReal implements Camera {
	private String id;

	public CameraReal(String id) {
		this.id = id;
	    conectar(); // simula operação custosa
	}
	
	private void conectar() {
		System.out.println("Conectando à câmera " + id + "...");
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Câmera ID: " + id);
	}
	
	@Override
	public void acessarStream() {
		System.out.println("Transmitindo vídeo da câmera " + id + "...");
	}
}
