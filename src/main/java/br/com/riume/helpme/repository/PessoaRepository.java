package br.com.riume.helpme.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.riume.helpme.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

	Optional<Pessoa> findByCpf(String cpf);
	Optional<Pessoa> findByEmail(String email);

}
