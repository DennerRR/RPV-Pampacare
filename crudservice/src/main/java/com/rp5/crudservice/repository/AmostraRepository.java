package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Amostra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmostraRepository extends JpaRepository<Amostra, Long> {
    Amostra findAmostraById(Long id);
}
