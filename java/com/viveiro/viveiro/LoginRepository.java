package com.viveiro.viveiro;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, Integer> {

    int count();

    void save(Login login);

    Optional<Login> findById(int i);}


