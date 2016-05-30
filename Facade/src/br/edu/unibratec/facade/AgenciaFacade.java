package br.edu.unibratec.facade;

import br.edu.unibratec.model.CiaAerea;
import br.edu.unibratec.model.Cliente;
import br.edu.unibratec.model.Hotel;

/**
 * Created by ecavalcanti on 28/05/16.
 */
public class AgenciaFacade {
    private Hotel hotel;
    private CiaAerea ciaAerea;

    public AgenciaFacade(Hotel hotel, CiaAerea ciaAerea) {
        this.hotel = hotel;
        this.ciaAerea = ciaAerea;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public CiaAerea getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(CiaAerea ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public void registrarViagem(Cliente cliente) {
        this.hotel.registrarReserva(cliente);
        this.ciaAerea.reservarVoo(cliente);
    }
}
