package br.edu.unibratec.log;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);
    }
}
