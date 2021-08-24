package com.rp5.propriedade.ServiceImplements;

import com.netflix.discovery.converters.Auto;
import com.rp5.propriedade.interfaces.IPropriedadeService;
import com.rp5.propriedade.model.Propriedade;
import com.rp5.propriedade.repository.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PropriedadeServiceImplements implements IPropriedadeService {
    private PropriedadeRepository propriedadeRepository;

    @Autowired
    public PropriedadeServiceImplements(PropriedadeRepository propriedadeRepository) {
        this.propriedadeRepository = propriedadeRepository;
    }

    @Override
    @Transactional
    public void savePropriedade(Propriedade propriedade) {
        propriedadeRepository.save(propriedade);
}

    @Override
    public Propriedade getPropriedadeById(Long id) {
        return propriedadeRepository.findPropriedadeById(id);
    }


    public Propriedade getPropriedadeByLatitudeAndLongitude(String lat, String longit) {
        return propriedadeRepository.findPropriedadeByLongitudeAndLatitude(longit, lat);
    }

    @Override
    public Propriedade updatePropriedade(Propriedade propriedade) {
        return propriedadeRepository.save(propriedade);
    }

    @Override
    public void deletePropriedade(Long id) {
        propriedadeRepository.deleteById(id);

    }

    @Override
    public List<Propriedade> findAllPropriedades() {
        return null;
    }
}
