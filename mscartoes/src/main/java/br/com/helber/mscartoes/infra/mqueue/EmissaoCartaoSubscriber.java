package br.com.helber.mscartoes.infra.mqueue;




public class EmissaoCartaoSubscriber {


    public void receberSolicitacaoEmissao(String payload) {
        System.out.println(payload);
    }
}
