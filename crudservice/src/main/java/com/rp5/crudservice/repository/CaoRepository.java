package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Cao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaoRepository extends JpaRepository<Cao, Long> {

    Cao findCaoById(Long id);
}
