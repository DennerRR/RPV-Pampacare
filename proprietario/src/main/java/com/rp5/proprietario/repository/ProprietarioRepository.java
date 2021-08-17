package com.rp5.proprietario.repository;

import com.rp5.proprietario.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    Proprietario findProprietarioById(Long id);

}
