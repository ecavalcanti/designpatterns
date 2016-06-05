package br.edu.unibratec;

import br.edu.unibratec.iterator.Iterator;
import br.edu.unibratec.iterator.NomesCollection;

public class Main {

    public static void main(String[] args) {
        String[] nomes = {"Eric", "Saulo", "Paulo", "João"};
        NomesCollection nomesCollection =
                new NomesCollection(nomes);

        Iterator iterator = nomesCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
