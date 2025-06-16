package com.viveiro.viveiro;

@Component
public class LaboratorioDataLoader implements CommandLineRunner {

    private final ContatoRepository contatoRepository;

    public LaboratorioDataLoader(LaboratorioRepository laboratorioRepository, ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }
    public void run(String... args) {
        Contato contato1 = (Contato) ((Object) contatoRepository.findById(1L));
        Contato contato2 = (Contato) contatoRepository.findById(2L);

        if (contato1 != null && contato2 != null) {
        }
    }
}
