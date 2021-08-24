package com.rp5.crudservice.interfaces;

import com.rp5.crudservice.model.Amostra;

import java.util.List;

public interface IAmostraService {
    public void saveAmostra(Amostra amostra);

    public Amostra getAmostraById(Long id);

    public Amostra updateAmostra(Amostra amostra);

    public void deleteAmostra(Long id);

    List<Amostra> findAllAmostra();
}
