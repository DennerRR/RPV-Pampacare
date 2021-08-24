package com.rp5.crudservice.ServiceImplements;

import com.rp5.crudservice.interfaces.IBairroService;
import com.rp5.crudservice.model.Bairro;
import com.rp5.crudservice.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BairroServiceImplements implements IBairroService {
    private BairroRepository bairroRepository;

    @Autowired
    public BairroServiceImplements(BairroRepository bairroRepository) {
        this.bairroRepository = bairroRepository;
    }

    @Override
    @Transactional
    public void saveBairro(Bairro bairro) {
        bairroRepository.save(bairro);
    }

    @Override
    public Bairro getBairroById(Long id) {
        return bairroRepository.findBairroById(id);
    }

    @Override
    public Bairro updateBairro(Bairro bairro) {
        return bairroRepository.save(bairro);
    }

    @Override
    public void deleteBairro(Long id) {
        bairroRepository.deleteById(id);

    }

    @Override
    public List<Bairro> findAllBairro() {
        return bairroRepository.findAll();
    }
}