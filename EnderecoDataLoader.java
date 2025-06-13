package com.viveiro.viveiro;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EnderecoDataLoader implements CommandLineRunner {

    private final EnderecoRepository enderecoRepository;

    public EnderecoDataLoader(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }


    @Override
    public void run(String... args) {
        List<Endereco> enderecos = List.of(
        );

        enderecoRepository.saveAll(enderecos);
    }


}



