package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
	    int x = 2;
        int y = 3;
        Calc calc = new Calc();
        int r = calc.soma(x, y);
        System.out.println(String.format("A soma de %d com %d é %d", x, y, r));
    }
}
