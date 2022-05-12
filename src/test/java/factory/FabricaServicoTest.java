package factory;

import model.IServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 ** created by: jorge.lessa
 */

class FabricaServicoTest {

    @Test
    void excecaoServicoInexistente()
    {
        try
        {
            IServico servico = FabricaServico.obterServico("Aluguel");
            fail();
        } catch (IllegalArgumentException e)
        {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void excecaoServicoInvalido()
    {
        try
        {
            IServico servico = FabricaServico.obterServico("Teste");
            fail();
        } catch (IllegalArgumentException e)
        {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

}