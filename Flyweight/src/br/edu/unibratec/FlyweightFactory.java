package br.edu.unibratec;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class FlyweightFactory {
    private List<SpriteFlyweight> flyweights;

    public enum Sprites {
        JOGADOR, INIMIGO_1, INIMIGO_2, INIMIGO_3,
        CENARIO_1, CENARIO_2
    }

    public FlyweightFactory() {
        flyweights = new ArrayList<>();
        flyweights.add(new Sprite("jogador.png"));
        flyweights.add(new Sprite("inimigo1.png"));
        flyweights.add(new Sprite("inimigo2.png"));
        flyweights.add(new Sprite("inimigo3.png"));
        flyweights.add(new Sprite("cenario1.png"));
        flyweights.add(new Sprite("cenario2.png"));
    }

    public SpriteFlyweight getFlyweight(Sprites tipo){
        switch (tipo) {
            case JOGADOR:
                return flyweights.get(0);
            case INIMIGO_1:
                return flyweights.get(1);
            case INIMIGO_2:
                return flyweights.get(2);
            case INIMIGO_3:
                return flyweights.get(3);
            case CENARIO_1:
                return flyweights.get(4);
            default:
                return flyweights.get(5);
        }

    }






}
