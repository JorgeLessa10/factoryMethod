package model;

import factory.FabricaServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** created by: jorge.lessa
 */
class ServicoCompraTest {

    @Test
    void efetuarCompra()
    {
        IServico servico = FabricaServico.obterServico("Compra");
        assertEquals("Compra efetuada com sucesso", servico.efetuar());
    }

    @Test
    void modificarCompra()
    {
        IServico servico = FabricaServico.obterServico("Compra");
        assertEquals("Compra modificada com sucesso", servico.modificar());
    }

    @Test
    void cancelarCompra()
    {
        IServico servico = FabricaServico.obterServico("Compra");
        assertEquals("Compra cancelada com sucesso", servico.cancelar());
    }

}