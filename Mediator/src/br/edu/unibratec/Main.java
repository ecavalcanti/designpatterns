package br.edu.unibratec;

import br.edu.unibratec.mediator.AndroidColleague;
import br.edu.unibratec.mediator.IOSColleague;
import br.edu.unibratec.mediator.MensagemMediator;

public class Main {

    public static void main(String[] args) {
        MensagemMediator mediator = new MensagemMediator();
        AndroidColleague android = new AndroidColleague(mediator);
        IOSColleague ios = new IOSColleague(mediator);
        mediator.adicionarContato(android);
        mediator.adicionarContato(ios);

        android.enviar("Oi eu sou o Android");
        ios.enviar("Oi eu sou o iOS");
    }
}
