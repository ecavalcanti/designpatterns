package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
	    Calc calc = new CalcProxy();
        int resultado = calc.somar(3,5);
        System.out.println(resultado);
    }
}
