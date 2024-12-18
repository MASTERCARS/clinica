package com.example.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clinica.model.Consulta;
import com.example.clinica.repository.IConsultaRepository;

@Service
@Transactional(readOnly = false)
public class ConsultaService {
    @Autowired
    private IConsultaRepository repository;

    public void salvar(Consulta consulta) {
        repository.save(consulta);
    }

    public void editar(Consulta consulta) {
        repository.save(consulta);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Consulta buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Consulta> buscarTodas() {
        return repository.findAll();
    }

}
