package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TIPOSUTILIZADOR")
public class TiposUtilizador
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTipoUtilizador")
    private int id;

    @Column(name = "dsTipoUtilizador")
    private String descricao;

    @Column(name = "tpTipoUtilizador")
    private char tipo;
}