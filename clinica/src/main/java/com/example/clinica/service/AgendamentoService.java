package com.example.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clinica.model.Agendamento;
import com.example.clinica.repository.IAgendamentoRepository;

@Service
@Transactional(readOnly = false)
public class AgendamentoService {
    @Autowired
    private IAgendamentoRepository repository;

    public void salvar(Agendamento Agendamento) {
        repository.save(Agendamento);
    }

    public void editar(Agendamento Agendamento) {
        repository.save(Agendamento);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Agendamento buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Agendamento> buscarTodas() {
        return repository.findAll();
    }

}
