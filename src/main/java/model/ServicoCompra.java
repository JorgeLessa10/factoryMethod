package model;
/*
 ** created by: jorge.lessa
 */
public class ServicoCompra implements IServico {

    @Override
    public String efetuar() {
        return "Compra efetuada com sucesso";
    }

    @Override
    public String modificar() {
        return "Compra modificada com sucesso";
    }

    @Override
    public String cancelar() {
        return "Compra cancelada com sucesso";
    }
}
