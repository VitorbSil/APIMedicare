package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

public class Cuidador
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDCUIDADOR")
    private int id;

    @Id
    @ManyToOne
    @JoinColumn(name = "IDUTILIZADOR")
    private Utilizador utilizador;
}