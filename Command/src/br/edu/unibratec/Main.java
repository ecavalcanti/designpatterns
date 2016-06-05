package br.edu.unibratec;

import br.edu.unibratec.commands.*;

public class Main {

    public static void main(String[] args) {
        Luz luz = new Luz();
        LigarLuzCommand ligarLuzCommand =
                new LigarLuzCommand(luz);
        DesligarLuzCommand desligarLuzCommand =
                new DesligarLuzCommand(luz);
        Interruptor interruptor = new Interruptor(
                ligarLuzCommand,
                desligarLuzCommand
        );
        interruptor.ligar();
        interruptor.desligar();


        Ventilador ventilador = new Ventilador();
        LigarVentiladorCommand ligarVentiladorCommand =
                new LigarVentiladorCommand(ventilador);
        DesligarVentiladorCommand desligarVentiladorCommand =
                new DesligarVentiladorCommand(ventilador);
        interruptor = new Interruptor(
                ligarVentiladorCommand,
                desligarVentiladorCommand
        );
        interruptor.ligar();
        interruptor.desligar();





    }
}
