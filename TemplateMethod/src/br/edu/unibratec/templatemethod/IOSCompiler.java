package br.edu.unibratec.templatemethod;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public class IOSCompiler extends CrossCompiler{
    @Override
    protected void collectAssets() {
        System.out.println("Gerando os assets iOS");
    }

    @Override
    protected void collectSource() {
        System.out.println("Gerando o código Swift " +
                "para iOS");
    }

    @Override
    protected void compileTarget() {
        System.out.println("Compilando o código Swift " +
                "para o iOS");
    }
}
