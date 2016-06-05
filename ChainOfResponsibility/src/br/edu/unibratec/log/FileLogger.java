package br.edu.unibratec.log;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
