package com.rp5.crudservice.ServiceImplements;

import com.rp5.crudservice.interfaces.ICondicaoService;
import com.rp5.crudservice.model.Condicao;
import com.rp5.crudservice.repository.CondicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CondicaoServiceImplements implements ICondicaoService {
    private CondicaoRepository condicaoRepository;

    @Autowired
    public CondicaoServiceImplements(CondicaoRepository condicaoRepository) {
        this.condicaoRepository = condicaoRepository;
    }

    @Override
    @Transactional
    public void saveCondicao(Condicao condicao) {
        condicaoRepository.save(condicao);
    }

    @Override
    public Condicao getCondicaoById(Long id) {
        return  condicaoRepository.findCondicaoById(id);
    }

    @Override
    public Condicao updateCondicao(Condicao condicao) {
        return condicaoRepository.save(condicao);
    }

    @Override
    public void deleteCondicao(Long id) {
        condicaoRepository.deleteById(id);

    }

    @Override
    public List<Condicao> findAllCondicoes() {
        return null;
    }
}
