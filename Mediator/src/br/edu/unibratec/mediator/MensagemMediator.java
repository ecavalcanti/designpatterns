package br.edu.unibratec.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class MensagemMediator implements Mediator {
    private List<Colleague> contatos;

    public MensagemMediator() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Colleague colleague) {
        contatos.add(colleague);
    }

    @Override
    public void enviar(String mensagem, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (colleague != contato) {
                contato.receber(mensagem);
            }
        }
    }






}
