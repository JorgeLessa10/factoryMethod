package model;
/*
 ** created by: jorge.lessa
 */
public class ServicoReserva implements IServico {

    @Override
    public String efetuar() {
        return "Reserva efetuada com sucesso";
    }

    @Override
    public String modificar() {
        return "Reserva modificada com sucesso";
    }

    @Override
    public String cancelar() {
        return "Reserva cancelada com sucesso";
    }
}
