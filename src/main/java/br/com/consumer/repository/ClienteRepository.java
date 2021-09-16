package br.com.consumer.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.consumer.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
