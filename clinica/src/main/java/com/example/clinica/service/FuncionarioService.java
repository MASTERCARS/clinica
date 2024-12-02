package com.example.clinica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.clinica.model.Funcionario;
import com.example.clinica.repository.IFuncionarioRepository;

@Service
@Transactional(readOnly = false)
public class FuncionarioService {
    @Autowired
    private IFuncionarioRepository repository;

    public void salvar(Funcionario funcionario) {
        repository.save(funcionario);
    }

    public void editar(Funcionario funcionario) {
        repository.save(funcionario);
    }

    public void excluir(Long id) {
        // verificar se existe algum funcionario vinculado ao Funcionario
        repository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Funcionario buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    @Transactional(readOnly = true)
    public List<Funcionario> buscarTodas() {
        return repository.findAll();
    }

}
