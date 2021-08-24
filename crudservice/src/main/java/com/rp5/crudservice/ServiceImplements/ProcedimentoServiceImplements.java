package com.rp5.crudservice.ServiceImplements;

import com.rp5.crudservice.interfaces.IProcedimentoService;
import com.rp5.crudservice.model.Procedimento;
import com.rp5.crudservice.repository.ProcedimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProcedimentoServiceImplements implements IProcedimentoService {
    private ProcedimentoRepository procedimentoRepository;

    @Autowired
    public ProcedimentoServiceImplements(ProcedimentoRepository procedimentoRepository) {
        this.procedimentoRepository = procedimentoRepository;
    }

    @Override
    @Transactional
    public void saveProcedimento(Procedimento procedimento) {
        procedimentoRepository.save(procedimento);
    }

    @Override
    public Procedimento getProcedimentoById(Long id) {
        return procedimentoRepository.findProcedimentoById(id);
    }

    @Override
    public Procedimento updateProcedimento(Procedimento procedimento) {
        return procedimentoRepository.save(procedimento);
    }

    @Override
    public void deleteProcedimento(Long id) {
        procedimentoRepository.deleteById(id);

    }

    @Override
    public List<Procedimento> findAllProcedimento() {
        return procedimentoRepository.findAll();
    }
}
