package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Medico;

public interface IMedicoRepository extends JpaRepository<Medico, Long> {

}
