package br.com.senac.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.dominio.Endereco;

public interface EnderecoRepositorio extends JpaRepository<Endereco, Integer> {

}
