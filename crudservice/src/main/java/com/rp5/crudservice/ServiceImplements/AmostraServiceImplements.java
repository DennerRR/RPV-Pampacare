package com.rp5.crudservice.ServiceImplements;

import com.rp5.crudservice.interfaces.IAmostraService;
import com.rp5.crudservice.model.Amostra;
import com.rp5.crudservice.repository.AmostraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AmostraServiceImplements implements IAmostraService {
    private AmostraRepository amostraRepository;

    @Autowired
    public AmostraServiceImplements(AmostraRepository amostraRepository) {
        this.amostraRepository = amostraRepository;
    }

    @Override
    @Transactional
    public void saveAmostra(Amostra amostra) {
        amostraRepository.save(amostra);
    }

    @Override
    public Amostra getAmostraById(Long id) {
        return amostraRepository.findAmostraById(id);
    }

    @Override
    public Amostra updateAmostra(Amostra amostra) {
        return amostraRepository.save(amostra);
    }

    @Override
    public void deleteAmostra(Long id) {
        amostraRepository.deleteById(id);

    }

    @Override
    public List<Amostra> findAllAmostra() {
        return amostraRepository.findAll();
    }
}