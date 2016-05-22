package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Pizza {
    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;

    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.queijo = builder.queijo;
        this.tomate = builder.tomate;
        this.bacon = builder.bacon;
    }

    public static class Builder {
        // requerido
        private final int tamanho;

        // opcionais
        private boolean queijo = false;
        private boolean tomate = false;
        private boolean bacon = false;

        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo() {
            this.queijo = true;
            return this;
        }

        public Builder tomate() {
            this.tomate = true;
            return this;
        }
        public Builder bacon() {
            this.bacon = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
