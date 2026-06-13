package ppp.lab3.ex2;

import ppp.lab3.ex1.AdaptadorPato;
import ppp.lab3.ex1.AdaptadorPavao;
import ppp.lab3.ex1.Ave;
import ppp.lab3.ex1.Pato;
import ppp.lab3.ex1.PatoDomestico;
import ppp.lab3.ex1.Pavao;
import ppp.lab3.ex1.PavaoAzul;

public class Main {

	public static void main(String[] args) {
		CalcBinaria calcBinaria = new CalculadoraBinaria();
		CalcDecimal calcDecimal = new CalculadoraDecimal();
        CalcDecimal calc = new CalculadoraAdapter(calcBinaria);

        System.out.println("Soma: " + calc.somar(5, 3));
        System.out.println("Subtração: " + calc.subtrair(10, 3));
        System.out.println("Multiplicação: " + calc.multiplicar(8, 2));

	}

}
