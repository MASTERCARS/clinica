package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Paciente;

public interface IPacienteRepository extends JpaRepository<Paciente, Long> {

}
