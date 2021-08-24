package com.rp5.crudservice.ServiceImplements;


import com.rp5.crudservice.interfaces.ICaoService;
import com.rp5.crudservice.model.Cao;
import com.rp5.crudservice.repository.CaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CaoServiceImplements implements ICaoService {
    private CaoRepository caoRepository;

    @Autowired
    public CaoServiceImplements(CaoRepository caoRepository) {
        this.caoRepository = caoRepository;
    }

    @Override
    @Transactional
    public void saveCao(Cao cao) {
        caoRepository.save(cao);
    }

    @Override
    public Cao getCaoById(Long id) {
        return caoRepository.findCaoById(id);
    }

    @Override
    public Cao updateCao(Cao cao) {
        return caoRepository.save(cao);
    }

    @Override
    public void deleteCao(Long id) {
        caoRepository.deleteById(id);

    }

    @Override
    public List<Cao> findAllCaes() {
        return caoRepository.findAll();
    }
}
