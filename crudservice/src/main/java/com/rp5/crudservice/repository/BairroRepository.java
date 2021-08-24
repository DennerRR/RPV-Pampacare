package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Bairro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<Bairro, Long> {
    Bairro findBairroById(Long id);
}
