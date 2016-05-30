package br.edu.unibratec;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class CalcProxy implements Calc {

    private Calc calc;

    @Override
    public int somar(int x, int y) {

        if (calc == null) {
            calc = new CalcImpl();
        }

        return calc.somar(x, y);
    }
}
