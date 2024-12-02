package com.example.clinica;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.clinica.model.*;
import com.example.clinica.service.*;

@SpringBootApplication
public class ClinicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo(PacienteService pac, EspecialidadeService esp, MedicoService ms, ConsultaService cs,
			AgendamentoService ag, FuncionarioService fun) {
		return (args) -> {
			Paciente p = new Paciente();
			p.setCPF("127.872.092-98");
			p.setGenero("m");
			p.setNome("vitor");
			p.setTelefone("(33)13713913");

			pac.salvar(p);

			Especialidade e = new Especialidade();
			e.setNome("cardiologista");
			e.setDescricao("Exames no coração");
			esp.salvar(e);

			List<Especialidade> listae = new ArrayList<>();
			listae.add(e);
			Medico m = new Medico();
			m.setCRM("2137djfhdj23721");
			m.setContato("71297217429");
			m.setEspecialidades(listae);
			m.setNome("carlos");
			ms.salvar(m);

			// tabela Consulta
			Consulta c = new Consulta();
			c.setMedico(m);
			c.setPaciente(p);
			c.setData(LocalDate.of(2024, 12, 1));
			c.setHorario(LocalTime.of(2, 40, 47));
			c.setValor(new BigDecimal(340.80));
			c.setCancelamento(false);
			cs.salvar(c);
			// tabela funcionario
			Funcionario f = new Funcionario();
			f.setFuncao("atendente");
			f.setNome("julia");
			f.setGenero("feminino");
			f.setTurno("diurno");
			fun.salvar(f);

			Agendamento a = new Agendamento();
			a.setData(c.getData());
			a.setHorario(c.getHorario());
			a.setMedico(m);
			ag.salvar(a);
		};
	}
}
