package ppp.lab3.ex4;

//Cliente
public class Main {
	public static void main(String[] args) {
	     // Cliente só conhece o Proxy
	     Camera camera1 = new CameraProxy("CAM-01", "admin");
	     Camera camera2 = new CameraProxy("CAM-02", "visitante");

	     camera1.exibirInfo();
	     camera1.acessarStream();

	     camera2.exibirInfo();
	     camera2.acessarStream();
	}
}