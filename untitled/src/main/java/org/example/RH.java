package org.example;

public class RH implements Setor {

    private static RH instancia = new RH();

    private RH() {}

    public static RH getInstancia() {
        return instancia;
    }

    @Override
    public String receberPedidoFerias(String mensagem) {
        return "RH recebeu o pedido de férias: " + mensagem;
    }

    @Override
    public String receberPedidoAdiantamento(String mensagem) {
        return "RH não trata adiantamentos.";
    }

    @Override
    public String receberPedidoComprovante(String mensagem) {
        return "RH não emite comprovantes.";
    }
}