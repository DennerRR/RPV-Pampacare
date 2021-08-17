package com.rp5.exame.repository;

import com.rp5.cao.model.Cao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

    Exame findExameById(Long id);
}
