package com.example.clinica.model;

import jakarta.persistence.*;

@Entity

@Table(name = "FUNCIONARIOS")
public class Funcionario extends AbstractEntity<Long> {
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private String funcao;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String turno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", funcao=" + funcao + ", genero=" + genero + ", turno=" + turno + "]";
    }

}
