package org.example;

public abstract class Pessoa {

    public String pedirFerias(String mensagem) {
        return CentralAtendimento.getInstancia().encaminharFerias(mensagem);
    }

    public String pedirAdiantamento(String mensagem) {
        return CentralAtendimento.getInstancia().encaminharAdiantamento(mensagem);
    }

    public String pedirComprovante(String mensagem) {
        return CentralAtendimento.getInstancia().encaminharComprovante(mensagem);
    }

}


