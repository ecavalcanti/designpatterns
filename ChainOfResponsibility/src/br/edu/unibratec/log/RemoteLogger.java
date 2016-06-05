package br.edu.unibratec.log;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class RemoteLogger extends AbstractLogger {

    public RemoteLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Remote::Logger: " + message);
    }
}
