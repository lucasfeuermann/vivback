package com.viveiro.viveiro;

import java.util.List;

@Component
public class EnderecoDataLoader implements CommandLineRunner {

    private final EnderecoRepository enderecoRepository;

    public EnderecoDataLoader(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    public void run(String... args) {
        List<Endereco> enderecos = List.of(
        );

        enderecoRepository.saveAll(enderecos);
    }


}



