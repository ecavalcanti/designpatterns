package br.edu.unibratec.model;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class Hotel {
    private String nome;
    private double valorDiaria;

    public Hotel(String nome, double valorDiaria) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void registrarReserva(Cliente cliente) {

        System.out.println("O Hotel " + this.nome +
        " informa que a reserva para ");

        System.out.println(cliente.getNome() + " " +
        cliente.getSobreNome() +
        " foi realizada com sucesso");

    }










}
