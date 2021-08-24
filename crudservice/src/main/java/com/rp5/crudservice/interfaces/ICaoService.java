package com.rp5.crudservice.interfaces;


import com.rp5.crudservice.model.Cao;

import java.util.List;

public interface ICaoService {
    public void saveCao(Cao cao);

    public Cao getCaoById(Long id);

    public Cao updateCao(Cao cao);

    public void deleteCao(Long id);

    List<Cao> findAllCaes();

}
