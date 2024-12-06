package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "REMEDIOS_UTILIZADOR")
public class RemedioUtilizador {
    @Id
    @Column(name = "IDREMEDIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Remedio idRemedio;

    @ManyToOne
    @JoinColumn(name = "idUtilizador")
    private Utilizador idUtilizador;
}