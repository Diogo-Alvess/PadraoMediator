package org.example;

public class CentralAtendimento {

    private static CentralAtendimento instancia = new CentralAtendimento();

    private CentralAtendimento() {}

    public static CentralAtendimento getInstancia() {
        return instancia;
    }

    public String encaminharFerias(String mensagem) {
        return "Central de Atendimento processou seu pedido.\n" +
                "O RH respondeu conforme mensagem abaixo:\n" +
                ">> " + RH.getInstancia().receberPedidoFerias(mensagem);
    }

    public String encaminharAdiantamento(String mensagem) {
        return "Central de Atendimento processou seu pedido.\n" +
                "O Financeiro respondeu conforme mensagem abaixo:\n" +
                ">> " + Financeiro.getInstancia().receberPedidoAdiantamento(mensagem);
    }

    public String encaminharComprovante(String mensagem) {
        return "Central de Atendimento processou seu pedido.\n" +
                "O Financeiro respondeu conforme mensagem abaixo:\n" +
                ">> " + Financeiro.getInstancia().receberPedidoComprovante(mensagem);
    }
}