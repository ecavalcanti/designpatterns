package br.edu.unibratec;

import br.edu.unibratec.facade.AgenciaFacade;
import br.edu.unibratec.model.CiaAerea;
import br.edu.unibratec.model.Cliente;
import br.edu.unibratec.model.Hotel;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eric", "Cavalcanti");
        Hotel hotel = new Hotel("Solemar", 220.0);
        CiaAerea ciaAerea = new CiaAerea("VoeBem");

        AgenciaFacade agenciaFacade =
                new AgenciaFacade(hotel, ciaAerea);

        agenciaFacade.registrarViagem(cliente);
    }
}
