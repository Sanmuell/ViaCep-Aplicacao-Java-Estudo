package br.com.consumer.service;

import br.com.consumer.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void deletar(Long id);

	void atualizar(Long id, Cliente cliente);

}
