package com.example.clinica.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity

@Table(name = "CONSULTAS")
public class Consulta extends AbstractEntity<Long> {

    @OneToOne
    @JoinColumn(name = "paciente_id_fk") // Especifica a FK
    private Paciente paciente;
    @OneToOne
    @JoinColumn(name = "medico_id_fk") // Supondo que Medico também seja uma entidade
    private Medico medico;

    @Column(nullable = false)
    private LocalTime horario;
    @Column(name = "data_consulta", nullable = false, columnDefinition = "DATE")
    private LocalDate data;
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal valor;
    @Column(nullable = false, unique = true)
    private boolean cancelamento;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public boolean isCancelamento() {
        return cancelamento;
    }

    public void setCancelamento(boolean cancelamento) {
        this.cancelamento = cancelamento;
    }

    @Override
    public String toString() {
        return "Consulta [paciente=" + paciente + ", medico=" + medico + ", horario=" + horario
                + ", data=" + data + ", valor=" + valor + ", cancelamento=" + cancelamento + "]";
    }

}
