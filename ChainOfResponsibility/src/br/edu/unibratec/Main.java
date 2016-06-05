package br.edu.unibratec;

import br.edu.unibratec.log.AbstractLogger;
import br.edu.unibratec.log.ConsoleLogger;
import br.edu.unibratec.log.FileLogger;
import br.edu.unibratec.log.RemoteLogger;
import com.sun.tools.javac.util.AbstractLog;

public class Main {

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger remoteLogger =
                new RemoteLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger =
                new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger =
                new ConsoleLogger(AbstractLogger.INFO);

        remoteLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return remoteLogger;

    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,
                "Este é um log INFO");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "Este é um log DEBUG");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "Este é um log ERROR");

    }
}
