package br.edu.unibratec.mediator;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class IOSColleague extends Colleague {

    public IOSColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("iOS recebeu a mensagem: " +
            mensagem);
    }
}
