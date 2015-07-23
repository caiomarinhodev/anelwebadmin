package models;

import javax.persistence.*;

/**
 * Created by Caio on 22/07/2015.
 */
@Entity
@Table(name = "TRANSACAO")
public class Transacao {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String descricao;
    @Column
    private String data_hora;
    @Column
    private Long clienteid;

    public Transacao(){

    }

    public Transacao(String descricao, String data_hora, Long clienteid) {
        this.descricao = descricao;
        this.data_hora = data_hora;
        this.clienteid = clienteid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public Long getClienteid() {
        return clienteid;
    }

    public void setClienteid(Long clienteid) {
        this.clienteid = clienteid;
    }
}
