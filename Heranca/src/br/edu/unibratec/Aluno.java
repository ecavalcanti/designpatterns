package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println(this.nome + " estudando...");
    }

}
