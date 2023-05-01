package br.com.helber.mscartoes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class ClienteCartao {
    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    @ManyToOne
    @JoinColumn(name = "id_cartap")
    private Cartao cartao;
    private BigDecimal limite;
}
