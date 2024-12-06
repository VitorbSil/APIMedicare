package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@Table(name = "REMEDIOS")
public class Remedio
{
    @Id
    @Column(name = "IDREMEDIO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="NMREMEDIO")
    private String nome; //Nome mínimo de 3 caracteres

    @Column(name="NTREMEDIO")
    private String anotação; //Anotação de um Remédio: Para dor, gripe, etc.

    @Column(name="DOSAGEM")
    private int dosagem;

    @Column(name="NMLABOLATORIO")
    private String nmlaboratorio;

    @Column(name = "DTREGISTROREMEDIO")
    private LocalDateTime dtRegistroRemedio;

    @Column(name = "VLDREMEDIO")
    private LocalDateTime vldRemedio;

    @Column(name = "QTDREMEDIO")
    private int qtdRemedio; //Quantidade não pode ser 0.


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnotação() {
        return anotação;
    }

    public void setAnotação(String anotação) {
        this.anotação = anotação;
    }

    public int getDosagem() {
        return dosagem;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }

    public String getNmlaboratorio() {
        return nmlaboratorio;
    }

    public void setNmlaboratorio(String nmlaboratorio) {
        this.nmlaboratorio = nmlaboratorio;
    }

    public LocalDateTime getDtRegistroRemedio() {
        return dtRegistroRemedio;
    }

    public void setDtRegistroRemedio(LocalDateTime dtRegistroRemedio) {
        this.dtRegistroRemedio = dtRegistroRemedio;
    }

    public LocalDateTime getVldRemedio() {
        return vldRemedio;
    }

    public void setVldRemedio(LocalDateTime vldRemedio) {
        this.vldRemedio = vldRemedio;
    }

    public int getQtdRemedio() {
        return qtdRemedio;
    }

    public void setQtdRemedio(int qtdRemedio) {
        this.qtdRemedio = qtdRemedio;
    }
}
