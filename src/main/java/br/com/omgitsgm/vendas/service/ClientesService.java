package br.com.omgitsgm.vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.omgitsgm.vendas.repository.ClientesRepository;
import model.Cliente;

@Service
public class ClientesService {
    
    @Autowired
    ClientesRepository clientesRepository;
    // Outra maneira de realizar a depedency injection.
    // private ClientesRepository repository;
    // public ClientesService(ClientesRepository repository) {
    //     this.repository = repository;
    // }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.clientesRepository.persistir(cliente);
    }
    
    public void validarCliente(Cliente cliente) {
        
    }

}
