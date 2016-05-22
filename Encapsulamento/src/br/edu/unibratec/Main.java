package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
	    Pessoa pessoa = new Pessoa();
        pessoa.setNome("Eric");
        System.out.println(pessoa.getNome());
        pessoa.setIdade(20);
        System.out.println(pessoa.getIdade());
        try {
            pessoa.falar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
