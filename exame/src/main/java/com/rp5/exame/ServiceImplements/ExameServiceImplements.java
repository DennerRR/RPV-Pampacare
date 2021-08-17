package com.rp5.exame.ServiceImplements;

import com.netflix.discovery.converters.Auto;
import com.rp5.cao.interfaces.ICaoService;
import com.rp5.cao.model.Cao;
import com.rp5.cao.repository.CaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ExameServiceImplements implements IExameService {
    private ExameRepository exameRepository;

    @Autowired
    public ExameServiceImplements(ExameRepository ExameRepository) {
        this.exameRepository = exameRepository;
    }

    @Override
    @Transactional
    public void saveExame(Exame exame) {
        exameRepository.save(exame);
    }

    @Override
    public Exame getExameById(Long id) {
        return exameRepository.findExameById(id);
    }

    @Override
    public Exame updateExame(Exame exame) {
        return exameRepository.save(exame);
    }

    @Override
    public void deleteExame(Long id) {
        exameRepository.deleteById(id);

    }

    @Override
    public List<Exame> findAllExames() {
        return null;
    }
}
