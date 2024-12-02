package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Agendamento;

public interface IAgendamentoRepository extends JpaRepository<Agendamento, Long> {

}
