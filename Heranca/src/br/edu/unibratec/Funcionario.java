package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Funcionario extends Pessoa {

    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void trabalhar() {
        System.out.println(nome + " trabalhando...");
    }

}
