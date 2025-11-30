package org.example;

public class Financeiro implements Setor {

    private static Financeiro instancia = new Financeiro();

    private Financeiro() {}

    public static Financeiro getInstancia() {
        return instancia;
    }

    @Override
    public String receberPedidoFerias(String mensagem) {
        return "Financeiro não trata pedidos de férias.";
    }

    @Override
    public String receberPedidoAdiantamento(String mensagem) {
        return "Financeiro aprovou seu adiantamento: " + mensagem;
    }

    @Override
    public String receberPedidoComprovante(String mensagem) {
        return "Financeiro enviou o comprovante solicitado: " + mensagem;
    }
}
