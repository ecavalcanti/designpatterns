package br.edu.unibratec.iterator;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class NomesCollection implements Container {
    private String nomes[];

    public NomesCollection(String[] nomes) {
        this.nomes = nomes;
    }

    @Override
    public Iterator createIterator() {
        return new NomesIterator();
    }

    private class NomesIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < nomes.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return nomes[index++];
            } else {
                return null;
            }
        }
    }
}
