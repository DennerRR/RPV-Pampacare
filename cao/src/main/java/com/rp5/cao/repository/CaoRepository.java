package com.rp5.cao.repository;

import com.rp5.cao.model.Cao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaoRepository extends JpaRepository<Cao, Long> {

    Cao findCaoById(Long id);
}
