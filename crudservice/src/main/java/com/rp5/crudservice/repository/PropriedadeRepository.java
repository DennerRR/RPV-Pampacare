package com.rp5.crudservice.repository;

import com.rp5.crudservice.model.Propriedade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropriedadeRepository extends JpaRepository<Propriedade, Long> {
    Propriedade findPropriedadeById(Long id);
    Propriedade findPropriedadeByLongitudeAndLatitude(String longit, String lat);
}
