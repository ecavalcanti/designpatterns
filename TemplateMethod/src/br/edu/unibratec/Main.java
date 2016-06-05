package br.edu.unibratec;

import br.edu.unibratec.templatemethod.AndroidCompiler;
import br.edu.unibratec.templatemethod.CrossCompiler;
import br.edu.unibratec.templatemethod.IOSCompiler;

public class Main {

    public static void main(String[] args) {
        CrossCompiler iphone = new IOSCompiler();
        iphone.crossCompile();

        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }
}
