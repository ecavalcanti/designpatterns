package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Pessoa {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            System.out.println("Idade não pode ser menor que 18 anos");
        } else {
            this.idade = idade;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("Nome não pode ser vazio");
        } else {
            this.nome = nome;
        }
    }

    public void falar() throws Exception {
        if (nome == null || nome.isEmpty()) {
            throw new Exception("Nome está fazio");
        } else {
            System.out.println(nome + " está falando");
        }

    }

}
