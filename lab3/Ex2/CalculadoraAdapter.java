package ppp.lab3.ex2;

public class CalculadoraAdapter implements CalcDecimal{
	
	private CalcBinaria calcBinaria;
	
	public CalculadoraAdapter(CalcBinaria calcBinaria){
		this.calcBinaria = calcBinaria;
	}

	public int somar(int a, int b) {
		String resultadoBin = calcBinaria.somar(
				Integer.toBinaryString(a),
				Integer.toBinaryString(b)
				);
		return Integer.parseInt(resultadoBin, 2);
	}

	public int subtrair(int a, int b) {
		String resultadoBin = calcBinaria.subtrair(
				Integer.toBinaryString(a),
				Integer.toBinaryString(b)
				);
		return Integer.parseInt(resultadoBin, 2);
	}
	
	public int multiplicar(int a, int b) {
		System.out.println("Calc binária não faz multiplicação!");
		return a * b;
	}

}
