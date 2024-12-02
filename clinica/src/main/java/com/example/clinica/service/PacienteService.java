package com.example.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clinica.model.Paciente;
import com.example.clinica.repository.IPacienteRepository;

@Service
@Transactional(readOnly = false)
public class PacienteService {
    @Autowired
    private IPacienteRepository repository;

    public void salvar(Paciente paciente) {
        repository.save(paciente);
    }

    public void editar(Paciente paciente) {
        repository.save(paciente);
    }

    public void excluir(Long id) {
        // verificar se existe algum funcionario vinculado ao Paciente
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Paciente buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Paciente> buscarTodas() {
        return repository.findAll();
    }

}
