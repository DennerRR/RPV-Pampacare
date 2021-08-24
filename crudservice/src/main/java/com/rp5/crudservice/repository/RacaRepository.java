package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Raca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Long> {
    Raca findRacaById(Long id);
}
