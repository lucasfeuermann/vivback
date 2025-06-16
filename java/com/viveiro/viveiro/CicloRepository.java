package com.viveiro.viveiro;

public interface CicloRepository extends JpaRepository<Ciclo, Integer> {

    int count();

    void save(Ciclo ciclo);

    public Object findById(int i);
}

