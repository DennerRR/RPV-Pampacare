package com.rp5.cao.interfaces;

import com.rp5.cao.model.Cao;

import java.util.List;

public interface ICaoService {
    public void saveCao(Cao cao);

    public Cao getCaoById(Long id);

    public Cao updateCao(Cao cao);

    public void deleteCao(Long id);

    List<Cao> findAllCaes();

}
