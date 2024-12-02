package com.example.clinica.model;

import java.util.List;

import jakarta.persistence.*;

@Entity

@Table(name = "MEDICOS")
public class Medico extends AbstractEntity<Long> {
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private String CRM;

    @OneToMany(mappedBy = "medico")
    private List<Especialidade> especialidades;

    @Column(nullable = false, unique = true)
    private String contato;

    @OneToMany(mappedBy = "medico")
    private List<Agendamento> agendamentos;

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

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

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String cRM) {
        CRM = cRM;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public String toString() {
        return "Medico [nome=" + nome + ", CRM=" + CRM + ", especialidades=" + especialidades + ", contato=" + contato
                + ", agendamentos=" + agendamentos + ", consulta=" + consulta + "]";
    }

}
