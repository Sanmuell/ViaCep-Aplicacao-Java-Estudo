package br.com.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.consumer.model.Endereco;

@FeignClient (name = "viacep", url = "https://viacep.com.br/ws")
@Component
public interface ViaCepService {

	@GetMapping(value = "/{cep}/json")
	public Endereco consultarCep (@PathVariable String cep);
	
}
