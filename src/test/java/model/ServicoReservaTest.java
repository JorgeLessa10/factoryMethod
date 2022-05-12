package model;

import factory.FabricaServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** created by: jorge.lessa
 */
class ServicoReservaTest {

    @Test
    void efetuarReserva()
    {
        IServico servico = FabricaServico.obterServico("Reserva");
        assertEquals("Reserva efetuada com sucesso", servico.efetuar());
    }

    @Test
    void modificarReserva()
    {
        IServico servico = FabricaServico.obterServico("Reserva");
        assertEquals("Reserva modificada com sucesso", servico.modificar());
    }

    @Test
    void cancelarReserva()
    {
        IServico servico = FabricaServico.obterServico("Reserva");
        assertEquals("Reserva cancelada com sucesso", servico.cancelar());
    }

}