package com.example.listadetarefas.model;

import java.io.Serializable;

public class Tarefa implements Serializable {

    private String nomeTarefa;
    private Long id;

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
