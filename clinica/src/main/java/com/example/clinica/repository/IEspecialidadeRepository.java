package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Especialidade;

public interface IEspecialidadeRepository extends JpaRepository<Especialidade, Long> {

}
