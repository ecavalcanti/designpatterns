package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
	    Aluno aluno = new Aluno();
        aluno.setMatricula(1234);
        aluno.setNome("Paulo");
        aluno.estudar();
        aluno.dormir();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Eric");
        funcionario.setDepartamento("Desenvolvimento");
        funcionario.trabalhar();
        funcionario.dormir();
    }
}
