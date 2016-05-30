package br.edu.unibratec.model;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class CiaAerea {
    private String nome;

    public CiaAerea(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void reservarVoo(Cliente cliente) {

        System.out.println("Voo reservado na Cia " +
        this.nome);

        System.out.println("para " + cliente.getNome() +
        " " + cliente.getSobreNome());

    }






}
