package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Arquiteto implements Funcionario {
    @Override
    public void trabalhar(String tarefa) {
        System.out.println("Arquiteto projetando... " + tarefa);
    }
}
