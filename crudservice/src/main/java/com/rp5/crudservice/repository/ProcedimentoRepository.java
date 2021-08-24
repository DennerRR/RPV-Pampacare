package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {
    Procedimento findProcedimentoById(Long id);
}
