package com.example.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.clinica.model.Funcionario;

public interface IFuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
