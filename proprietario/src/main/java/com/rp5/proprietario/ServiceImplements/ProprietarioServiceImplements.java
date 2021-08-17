package com.rp5.proprietario.ServiceImplements;

import com.rp5.proprietario.interfaces.IProprietarioService;
import com.rp5.proprietario.model.Proprietario;
import com.rp5.proprietario.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProprietarioServiceImplements implements IProprietarioService {
    private ProprietarioRepository proprietarioRepository;
    
    @Autowired
    public ProprietarioServiceImplements(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }

    @Override
    @Transactional
    public void saveProprietario(Proprietario proprietario) {
        proprietarioRepository.save(proprietario);
    }

    @Override
    public Proprietario getProprietarioById(Long id) {
        return proprietarioRepository.findProprietarioById(id);
    }

    @Override
    public Proprietario updateProprietario(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    @Override
    public void deleteProprietario(Long id) {
        proprietarioRepository.deleteById(id);

    }

    @Override
    public List<Proprietario> findAllProprietarios() {
        return proprietarioRepository.findAll();
    }


}
