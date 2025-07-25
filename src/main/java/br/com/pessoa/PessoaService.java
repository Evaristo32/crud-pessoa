package br.com.pessoa;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public Pessoa salvarNoBancoDeDados(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizarNoBancoDeDados(Long id, Pessoa usuario) {
        Pessoa existente = pessoaRepository.findById(id).orElseThrow();
        existente.setNome(usuario.getNome());
        existente.setEmail(usuario.getEmail());
        return pessoaRepository.save(existente);
    }

    public Pessoa BuscarPessoaPorIdNoBancoDeDados(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }

    public void deletarPessoaPorIdNoBancoDeDados(Long id) {
        pessoaRepository.deleteById(id);
    }

    public List<Pessoa> buscarTodosNoBancoDeDados() {
        return pessoaRepository.findAll();
    }

}
