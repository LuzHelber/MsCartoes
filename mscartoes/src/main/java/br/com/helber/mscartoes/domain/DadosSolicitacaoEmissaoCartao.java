package br.com.helber.mscartoes.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DadosSolicitacaoEmissaoCartao {
    private Long IdCartao;
    private String cpf;
    private String endereco;
    private BigDecimal limiteLiberado;

}