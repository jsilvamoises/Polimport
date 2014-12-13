package com.jsilvamoises.polilog.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public  class Usuario implements Serializable {


    @Basic
    private String departamento;


    @Basic
    private String nome;


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;


    @Basic
    private String login;


    @Basic
    private String dataCadastro;


    @Basic
    private String status;

    public Usuario(){

    }


   public String getDepartamento() {
        return this.departamento;
    }


  public void setDepartamento (String departamento) {
        this.departamento = departamento;
    }



   public String getNome() {
        return this.nome;
    }


  public void setNome (String nome) {
        this.nome = nome;
    }



   public Long getId() {
        return this.id;
    }


  public void setId (Long id) {
        this.id = id;
    }



   public String getLogin() {
        return this.login;
    }


  public void setLogin (String login) {
        this.login = login;
    }



   public String getDataCadastro() {
        return this.dataCadastro;
    }


  public void setDataCadastro (String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }



   public String getStatus() {
        return this.status;
    }


  public void setStatus (String status) {
        this.status = status;
    }

}

