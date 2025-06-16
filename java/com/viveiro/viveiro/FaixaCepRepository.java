package com.viveiro.viveiro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaixaCepRepository extends JpaRepository<FaixaCep, String> {
}

