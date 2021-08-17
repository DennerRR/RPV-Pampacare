package com.rp5.condicao.interfaces;



import com.rp5.condicao.model.Condicao;

import java.util.List;

public interface ICondicaoService {
    public void saveCondicao(Condicao condicao);

    public Condicao getCondicaoById(Long id);

    public Condicao updateCondicao(Condicao condicao);

    public void deleteCondicao(Long id);

    List<Condicao> findAllCondicoes();

}
