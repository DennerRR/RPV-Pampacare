package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

    Exame findExameById(Long id);
}
