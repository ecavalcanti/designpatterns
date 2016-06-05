package br.edu.unibratec.templatemethod;

/**
 * Created by ecavalcanti on 04/06/16.
 */
public abstract class CrossCompiler {

    public final void crossCompile() {
        collectAssets();
        collectSource();
        compileTarget();
    }

    protected abstract void collectAssets();
    protected abstract void collectSource();
    protected abstract void compileTarget();

}
