package br.edu.unibratec;

public class Main {

    public static void main(String[] args) {
	    FabricaDeCarro fabricaDeCarro;
        String tipoFabrica = "fiat";
        Carro carro;

        if (tipoFabrica.equals("fiat")) {
            fabricaDeCarro = new FabricaFiat();
        } else {
            fabricaDeCarro = new FabricaChevrolet();
        }

        carro = fabricaDeCarro.criarCarro(1);
        carro.exibirInfo();

    }
}
