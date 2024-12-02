package com.example.clinica.model;

import jakarta.persistence.*;

@Entity

@Table(name = "ESPECIALIDADES")
public class Especialidade extends AbstractEntity<Long> {
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "id_medico_fk")
    private Medico medico;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Especialidade [nome=" + nome + ", descricao=" + descricao + "]";
    }

}
