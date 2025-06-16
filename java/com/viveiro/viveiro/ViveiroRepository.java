package com.viveiro.viveiro;

public interface ViveiroRepository extends JpaRepository<Viveiro, Integer> {

    void save(Viveiro viveiro);}

