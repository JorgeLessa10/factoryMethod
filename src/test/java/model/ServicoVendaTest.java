package model;

import factory.FabricaServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** created by: jorge.lessa
 */
class ServicoVendaTest {

    @Test
    void efetuarVenda()
    {
        IServico servico = FabricaServico.obterServico("Venda");
        assertEquals("Venda efetuada com sucesso", servico.efetuar());
    }

    @Test
    void modificarVenda()
    {
        IServico servico = FabricaServico.obterServico("Venda");
        assertEquals("Venda modificada com sucesso", servico.modificar());
    }

    @Test
    void cancelarVenda()
    {
        IServico servico = FabricaServico.obterServico("Venda");
        assertEquals("Venda cancelada com sucesso", servico.cancelar());
    }

}