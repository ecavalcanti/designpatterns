package br.edu.unibratec;

import ui.*;

public class Main {

    public static void main(String[] args) {
        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();

    }
}
