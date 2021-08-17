package com.rp5.etl.ServiceImplements;

import com.rp5.etl.model.Proprietario;
import com.rp5.etl.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

@Component
public class ProprietarioServiceImplements implements ItemWriter<Proprietario> {
    private ProprietarioRepository proprietarioRepository;

    @Autowired
    public ProprietarioServiceImplements(ProprietarioRepository proprietarioRepository) {
        this.proprietarioRepository = proprietarioRepository;
    }

    @Override
    public void write(List<? extends Proprietario> proprietarios) throws Exception {
        proprietarioRepository.saveAll(proprietarios);
    }
}
