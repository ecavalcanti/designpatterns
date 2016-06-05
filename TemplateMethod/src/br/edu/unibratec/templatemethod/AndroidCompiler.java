package br.edu.unibratec.templatemethod;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class AndroidCompiler extends CrossCompiler{
    @Override
    protected void collectAssets() {
        System.out.println("Gerando os assets Android");
    }

    @Override
    protected void collectSource() {
        System.out.println("Gerando o código Java " +
                "para Android");
    }

    @Override
    protected void compileTarget() {
        System.out.println("Compilando o código Java " +
                "para o Android");
    }
}
