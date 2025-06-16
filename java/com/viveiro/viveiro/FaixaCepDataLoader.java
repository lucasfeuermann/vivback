package com.viveiro.viveiro;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class FaixaCepDataLoader {

    private final FaixaCepRepository faixaCepRepository;

    public FaixaCepDataLoader(FaixaCepRepository faixaCepRepository) {
        this.faixaCepRepository = faixaCepRepository;
    }

    @PostConstruct
    public void loadData() {
        if (faixaCepRepository.count() == 0) {
            List<FaixaCep> faixas = Arrays.asList(
                new FaixaCep("AC", 69900000, 69999999),
                new FaixaCep("AL", 57000000, 57999999),
                new FaixaCep("AM", 69000000, 69299999),
                new FaixaCep("AP", 68900000, 68999999),
                new FaixaCep("BA", 40000000, 48999999),
                new FaixaCep("CE", 60000000, 63999999),
                new FaixaCep("DF", 70000000, 72799999),
                new FaixaCep("ES", 29000000, 29999999),
                new FaixaCep("GO", 72800000, 76799999),
                new FaixaCep("MA", 65000000, 65999999),
                new FaixaCep("MT", 78000000, 78899999),
                new FaixaCep("MS", 79000000, 79999999),
                new FaixaCep("MG", 30000000, 39999999),
                new FaixaCep("PA", 66000000, 68899999),
                new FaixaCep("PB", 58000000, 58999999),
                new FaixaCep("PR", 80000000, 87999999),
                new FaixaCep("PE", 50000000, 56999999),
                new FaixaCep("PI", 64000000, 64999999),
                new FaixaCep("RJ", 20000000, 28999999),
                new FaixaCep("RN", 59000000, 59999999),
                new FaixaCep("RS", 90000000, 99999999),
                new FaixaCep("RO", 76800000, 76999999),
                new FaixaCep("RR", 69300000, 69399999),
                new FaixaCep("SC", 88000000, 89999999),
                new FaixaCep("SE", 49000000, 49999999),
                new FaixaCep("SP", 1000000, 19999999),
                new FaixaCep("TO", 77000000, 77999999)
            );
            faixaCepRepository.saveAll(faixas);
        }
    }
}

