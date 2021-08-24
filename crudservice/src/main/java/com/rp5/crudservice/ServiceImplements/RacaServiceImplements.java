package com.rp5.crudservice.ServiceImplements;

import com.rp5.crudservice.interfaces.IRacaService;
import com.rp5.crudservice.model.Raca;
import com.rp5.crudservice.repository.RacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RacaServiceImplements implements IRacaService {
    private RacaRepository racaRepository;

    @Autowired
    public RacaServiceImplements(RacaRepository racaRepository) {
        this.racaRepository = racaRepository;
    }

    @Override
    @Transactional
    public void saveRaca(Raca raca) {
        racaRepository.save(raca);
    }

    @Override
    public Raca getRacaById(Long id) {
        return racaRepository.findRacaById(id);
    }

    @Override
    public Raca updateRaca(Raca raca) {
        return racaRepository.save(raca);
    }

    @Override
    public void deleteRaca(Long id) {
        racaRepository.deleteById(id);

    }

    @Override
    public List<Raca> findAllRaca() {
        return racaRepository.findAll();
    }
}
