package br.edu.unibratec;

import br.edu.unibratec.observer.Pessoa;
import br.edu.unibratec.observer.Produto;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Eric");
        Pessoa pessoa2 = new Pessoa("Artur");

        Produto mobile = new Produto("Motorola",
                "Moto G", "Não disponível");

        mobile.registerObserver(pessoa1);
        mobile.registerObserver(pessoa2);

        mobile.setDisponibilidade("Disponível");
    }
}
