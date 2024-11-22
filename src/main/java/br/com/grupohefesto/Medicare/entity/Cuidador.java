package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;

public class Cuidador
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCuidador")
    private int id;

    @OneToMany
    @JoinColumn(name = "idUtilizador")
    private Utilizador utilizador;


}