package com.viveiro.viveiro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class LaboratorioDataLoader implements CommandLineRunner {

    private final ContatoRepository contatoRepository;

    public LaboratorioDataLoader(LaboratorioRepository laboratorioRepository, ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public void run(String... args) {
        Contato contato1 = contatoRepository.findById(1L).orElse(null);
        Contato contato2 = contatoRepository.findById(2L).orElse(null);

        if (contato1 != null && contato2 != null) {
        }
    }
}