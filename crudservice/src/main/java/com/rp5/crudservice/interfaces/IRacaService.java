package com.rp5.crudservice.interfaces;


import com.rp5.crudservice.model.Raca;

import java.util.List;

public interface IRacaService {
    public void saveRaca(Raca raca);

    public Raca getRacaById(Long id);

    public Raca updateRaca(Raca raca);

    public void deleteRaca(Long id);

    List<Raca> findAllRaca();
}
