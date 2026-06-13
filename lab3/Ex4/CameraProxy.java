package ppp.lab3.ex4;

//Proxy - controla acesso
public class CameraProxy implements Camera {
	private String id;
	private CameraReal cameraReal;
	private String usuario;

	public CameraProxy(String id, String usuario) {
		this.id = id;
		this.usuario = usuario;
	}
	
	@Override
	public void exibirInfo() {
		System.out.println("Câmera ID: " + id + " (acesso via proxy)");
	}
	
	@Override
	public void acessarStream() {
		// Verifica permissão antes de acessar
		if (usuario.equals("admin")) {
			if (cameraReal == null) {
				cameraReal = new CameraReal(id);
				}
			cameraReal.acessarStream();
			} else {
				System.out.println("Acesso negado para usuário: " + usuario);
			}
	}
}
