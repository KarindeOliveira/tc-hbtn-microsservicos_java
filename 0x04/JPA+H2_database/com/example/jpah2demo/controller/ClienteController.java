package com.example.jpah2demo.controller;

import com.example.jpah2demo.entities.Cliente;
import com.example.jpah2demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api-jpa-h2")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping("/addClient")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
        Cliente cliente1 = clienteRepository.save(cliente);
        return ResponseEntity.ok().body(cliente1);
    }

    @GetMapping("/findAllClients")
    public ResponseEntity<List<Cliente>> findAllClients() {
        List<Cliente> list = clienteRepository.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/findClientById/{id}")
    public Optional <Cliente> findClientById(@PathVariable("id") Long idClient) {
        return clienteRepository.findById(idClient);


    }

    @DeleteMapping("/removeClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCliente(@PathVariable("id") Long idClient){
        clienteRepository.deleteById(idClient);
    }

    @PutMapping("/updateClientById/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        Optional<Cliente> clientFound = clienteRepository.findById(id);

        if (clientFound.isPresent()){
            Cliente clientUpdate = clientFound.get();
            clientUpdate.setNome(cliente.getNome());
            clientUpdate.setIdade(cliente.getIdade());
            clientUpdate.setEmail(cliente.getEmail());
            clientUpdate.setEndereco(cliente.getEndereco());
            clientUpdate.setTelefone(cliente.getTelefone());
            clienteRepository.save(clientUpdate);

    }
}}