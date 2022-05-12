package model;
/*
 ** created by: jorge.lessa
 */
public class ServicoVenda implements IServico {

    @Override
    public String efetuar() {
        return "Venda efetuada com sucesso";
    }

    @Override
    public String modificar() {
        return "Venda modificada com sucesso";
    }

    @Override
    public String cancelar() {
        return "Venda cancelada com sucesso";
    }

}
