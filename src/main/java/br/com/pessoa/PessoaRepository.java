package br.com.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Pessoa> findByLastName(String lastName);
}
