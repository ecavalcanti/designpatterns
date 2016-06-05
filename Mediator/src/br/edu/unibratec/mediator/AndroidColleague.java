package br.edu.unibratec.mediator;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class AndroidColleague extends Colleague {

    public AndroidColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Android recebeu a mensagem: " +
            mensagem);
    }
}
