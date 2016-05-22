package br.edu.unibratec;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	    Carro ford = new Ford("New Fiesta");
        ford.setPreco(55000);

        Carro fiat = new Fiat("Palio");
        fiat.setPreco(40000);

        Carro ford2 = ford.clonar();
        Carro fiat2 = fiat.clonar();

        System.out.println(ford2.getModelo() + " " + ford2.getPreco());
        System.out.println(fiat2.getModelo() + " " + fiat2.getPreco());
        fiat2.setPreco(45000);
        System.out.println(fiat2.getModelo() + " " + fiat2.getPreco());
        System.out.println(fiat.getModelo() + " " + fiat.getPreco());


    }
}
