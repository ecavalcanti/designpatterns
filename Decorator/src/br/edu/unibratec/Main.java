package br.edu.unibratec;

import br.edu.unibratec.bebidas.*;

public class Main {

    public static void main(String[] args) {
        Coquetel meuCoquetel = new Vodka();
        System.out.println(meuCoquetel.getNome() + " = " +
                meuCoquetel.getPreco());


        meuCoquetel = new Refrigerante(meuCoquetel);
        System.out.println(meuCoquetel.getNome() + " = " +
                meuCoquetel.getPreco());

        meuCoquetel = new Limao(meuCoquetel);
        System.out.println(meuCoquetel.getNome() + " = " +
                meuCoquetel.getPreco());


    }
}
