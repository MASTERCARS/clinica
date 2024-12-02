package com.example.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clinica.model.Especialidade;
import com.example.clinica.repository.IEspecialidadeRepository;

@Service
@Transactional(readOnly = false)
public class EspecialidadeService {
    @Autowired
    private IEspecialidadeRepository repository;

    public void salvar(Especialidade especialidade) {
        repository.save(especialidade);
    }

    public void editar(Especialidade especialidade) {
        repository.save(especialidade);
    }

    public void excluir(Long id) {
        // verificar se existe algum funcionario vinculado ao Especialidade
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Especialidade buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Especialidade> buscarTodas() {
        return repository.findAll();
    }

}
