package com.example.clinica.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.*;

@Entity

@Table(name = "AGENDAMENTOS")
public class Agendamento extends AbstractEntity<Long> {
    @Column(name = "data_consulta", nullable = false, columnDefinition = "DATE")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "id_medico_fk")
    private Medico medico; // tirar tipo e colocar medico

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Column(nullable = false)
    private LocalTime horario;

    // acrescentar em agendamento o medico, 1 pra varios(n)

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Agendamento [data=" + data + ", medico=" + medico + ", horario=" + horario + "]";
    }

}
