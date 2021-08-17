package com.rp5.propriedade.interfaces;

import com.rp5.propriedade.model.Propriedade;

import java.util.List;

public interface IPropriedadeService {
    public void savePropriedade(Propriedade propriedade);

    public Propriedade getPropriedadeById(Long id);

    public Propriedade updatePropriedade(Propriedade propriedade);

    public void deletePropriedade(Long id);

    List<Propriedade> findAllPropriedades();
}
