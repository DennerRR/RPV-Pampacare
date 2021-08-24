package com.rp5.crudservice.interfaces;

import com.rp5.crudservice.model.Procedimento;

import java.util.List;

public interface IProcedimentoService {
    public void saveProcedimento(Procedimento procedimento);

    public Procedimento getProcedimentoById(Long id);

    public Procedimento updateProcedimento(Procedimento procedimento);

    public void deleteProcedimento(Long id);

    List<Procedimento> findAllProcedimento();
}
