package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void devePedirFerias() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Central de Atendimento processou seu pedido.\n" +
                        "O RH respondeu conforme mensagem abaixo:\n" +
                        ">> RH recebeu o pedido de férias: Quero tirar férias em julho",
                funcionario.pedirFerias("Quero tirar férias em julho"));
    }

    @Test
    void devePedirAdiantamento() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Central de Atendimento processou seu pedido.\n" +
                        "O Financeiro respondeu conforme mensagem abaixo:\n" +
                        ">> Financeiro aprovou seu adiantamento: Preciso de R$ 500 adiantados",
                funcionario.pedirAdiantamento("Preciso de R$ 500 adiantados"));
    }

    @Test
    void devePedirComprovante() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Central de Atendimento processou seu pedido.\n" +
                        "O Financeiro respondeu conforme mensagem abaixo:\n" +
                        ">> Financeiro enviou o comprovante solicitado: Comprovante de pagamento de outubro",
                funcionario.pedirComprovante("Comprovante de pagamento de outubro"));
    }

}
