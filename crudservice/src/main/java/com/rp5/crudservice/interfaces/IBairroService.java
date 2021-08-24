package com.rp5.crudservice.interfaces;

import com.rp5.crudservice.model.Bairro;

import java.util.List;

public interface IBairroService {
    public void saveBairro(Bairro bairro);

    public Bairro getBairroById(Long id);

    public Bairro updateBairro(Bairro bairro);

    public void deleteBairro(Long id);

    List<Bairro> findAllBairro();
}
