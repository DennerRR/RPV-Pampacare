package com.rp5.exame.interfaces;

import com.rp5.cao.model.Cao;

import java.util.List;

public interface IExameService {
    public void saveExame(Exame exame);

    public Exame getExameById(Long id);

    public Exame updateExame(Exame exame);

    public void deleteExame(Long id);

    List<Exame> findAllExames();

}
