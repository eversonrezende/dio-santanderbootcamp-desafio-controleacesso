package com.dio.sistemaponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BancoHoras {
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private long idBancoHoras;
        private long idMovimento;
        private long idUsuario;
    }
    @Id
    @EmbeddedId
    private BancoHorasId bancoHorasId;
    private String categoriaUsuario;
    private LocalDate dataTrabalhada;
    private BigDecimal quantidadeDataTrabalhada;
    private BigDecimal saldoHorasTrabalhadas;
}
