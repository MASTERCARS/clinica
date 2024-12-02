package com.example.clinica.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PACIENTES")
public class Paciente extends AbstractEntity<Long> {

    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private String telefone;
    @Column(nullable = false)
    private String genero;
    @Column(nullable = false, unique = true)
    private String CPF;

    @OneToOne
    @JoinColumn(name = "consulta_id_fk")
    private Consulta consulta;

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    @Override
    public String toString() {
        return "Paciente [nome=" + nome + ", telefone=" + telefone + ", genero=" + genero + ", CPF=" + CPF
                + ", consulta=" + consulta + "]";
    }

}
