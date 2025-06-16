package com.viveiro.viveiro;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

    Object findById(long l);}

