package models;

import javax.persistence.*;

/**
 * Created by Caio on 04/06/2015.
 */
@Entity
@Table(name = "ADMIN")
public class Admin {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String login;
    @Column
    private String senha;

    public Admin(){

    }

    public Admin(String login, String senha) {
        this.login = login;
        this.nome = "Administrador";
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
