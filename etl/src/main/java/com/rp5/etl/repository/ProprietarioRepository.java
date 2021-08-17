package com.rp5.etl.repository;

import com.rp5.etl.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
}
