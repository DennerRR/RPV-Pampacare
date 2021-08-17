package com.rp5.condicao.repository;

import com.rp5.condicao.model.Condicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicaoRepository extends JpaRepository<Condicao, Long> {

    Condicao findCondicaoById(Long id);
}
