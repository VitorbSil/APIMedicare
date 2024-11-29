package br.com.grupohefesto.Medicare.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "UTILIZADOR")
public class Utilizador
{
    @Id
    @Column(name = "IDUTILIZADOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "IDTIPOUTILIZADOR")
    private TiposUtilizador tipoUtilizador;

    @Column(name = "NMUTILIZADOR")
    private String nomeUtilizador;

    @Column(name = "CNPJCPF")
    private String CNPJ_CPF;

    @Column(name = "EMUTILIZADOR")
    private String email;

    @Column(name = "TELUTILIZADOR")
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TiposUtilizador getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setTipoUtilizador(TiposUtilizador tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

    public String getNomeUtilizador() {
        return nomeUtilizador;
    }

    public void setNomeUtilizador(String nomeUtilizador) {
        this.nomeUtilizador = nomeUtilizador;
    }

    public String getCNPJ_CPF() {
        return CNPJ_CPF;
    }

    public void setCNPJ_CPF(String CNPJ_CPF) {
        this.CNPJ_CPF = CNPJ_CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
