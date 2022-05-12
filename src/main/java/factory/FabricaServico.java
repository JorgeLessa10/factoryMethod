package factory;
/*
 ** created by: jorge.lessa
 */
import model.IServico;

public class FabricaServico {

    public static IServico obterServico(String servico)
    {
        Class classe = null;
        Object objeto = null;

        try
        {
            classe = Class.forName("model.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception e)
        {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof IServico))
        {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServico) objeto;
    }

}
