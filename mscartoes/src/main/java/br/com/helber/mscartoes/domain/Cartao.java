package br.com.helber.mscartoes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
public class Cartao {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private BandeiraCartao banderia;
    private BigDecimal renda;
    private BigDecimal limiteBasico;

    public Cartao(String nome, BandeiraCartao banderia, BigDecimal renda, BigDecimal limiteBasico) {
        this.nome = nome;
        this.banderia = banderia;
        this.renda = renda;
        this.limiteBasico = limiteBasico;
    }
}
