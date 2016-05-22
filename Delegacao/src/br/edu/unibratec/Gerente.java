package br.edu.unibratec;

/**
 * Created by ecavalcanti on 14/05/16.
 */
public class Gerente implements Funcionario {
    private Estagiario estagiario;
    private Desenvolvedor desenvolvedor;
    private Arquiteto arquiteto;

    public Gerente(){
        estagiario = new Estagiario();
        desenvolvedor = new Desenvolvedor();
        arquiteto = new Arquiteto();
    }

    @Override
    public void trabalhar(String tarefa) {
        System.out.println("Gerente recebeu a tarefa " + tarefa);
        estagiario.trabalhar(tarefa);
        desenvolvedor.trabalhar(tarefa);
        arquiteto.trabalhar(tarefa);
    }
}
