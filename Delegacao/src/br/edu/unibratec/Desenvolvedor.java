package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Desenvolvedor implements Funcionario {
    @Override
    public void trabalhar(String tarefa) {
        System.out.println("Desenvolvedor programando... " + tarefa);
    }
}
