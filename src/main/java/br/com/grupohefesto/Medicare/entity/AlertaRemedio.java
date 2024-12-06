package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import jdk.jshell.execution.Util;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ALERTA_REMEDIO")
public class AlertaRemedio {
    @Id
    @Column(name = "idAlertaRemedio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hrRemedio")
    private int hrRemedio;

    @ManyToOne
    @JoinColumn(name = "IDREMEDIO")
    private Remedio idRemedio;

    @ManyToOne
    @JoinColumn(name = "idUtilizador")
    private Utilizador idUtilizador; //Quando juntar o projeto trocar de int para Utilizador

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHrRemedio() {
        return hrRemedio;
    }

    public void setHrRemedio(int hrRemedio) {
        this.hrRemedio = hrRemedio;
    }

    public Remedio getIdRemedio() {
        return idRemedio;
    }

    public void setIdRemedio(Remedio idRemedio) {
        this.idRemedio = idRemedio;
    }

    public Utilizador getIdUtilizador() {
        return idUtilizador;
    }

    public void setIdUtilizador(Utilizador idUtilizador) {
        this.idUtilizador = idUtilizador;
    }
}
