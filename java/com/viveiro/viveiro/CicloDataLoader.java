package com.viveiro.viveiro;

import java.sql.Timestamp;

@Component
public class CicloDataLoader implements CommandLineRunner {

    private final CicloRepository cicloRepository;

    public CicloDataLoader(CicloRepository cicloRepository) {
        this.cicloRepository = cicloRepository;
    }

    public void run(String... args) {
        if (cicloRepository.count() == 0) {
            Ciclo ciclo = new Ciclo();
            ciclo.setDataInicio(Timestamp.valueOf("2023-01-01 00:00:00"));
            ciclo.setDataFim(Timestamp.valueOf("2023-06-30 00:00:00"));
        ciclo.setDescricao("Ciclo da Primavera 2023");

        cicloRepository.save(ciclo);
        }
    }
}
