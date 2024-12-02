package com.example.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clinica.model.Medico;
import com.example.clinica.repository.IMedicoRepository;

@Service
@Transactional(readOnly = false)
public class MedicoService {
    @Autowired
    private IMedicoRepository repository;

    public void salvar(Medico medico) {
        repository.save(medico);
    }

    public void editar(Medico medico) {
        repository.save(medico);
    }

    public void excluir(Long id) {
        // verificar se existe algum funcionario vinculado ao Medico
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Medico buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Medico> buscarTodas() {
        return repository.findAll();
    }

}