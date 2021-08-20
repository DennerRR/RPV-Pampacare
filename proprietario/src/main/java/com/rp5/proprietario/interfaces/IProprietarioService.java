package com.rp5.proprietario.interfaces;

import com.rp5.proprietario.model.Proprietario;

import java.util.List;

public interface IProprietarioService {

    public void saveProprietario(Proprietario Proprietario);

    public Proprietario getProprietarioById(Long id);

    public Proprietario updateProprietario(Proprietario Proprietario);

    public void deleteProprietario(Long id);

    List<Proprietario> findAllProprietarios();
}
