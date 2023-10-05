package com.exe.misalario.services;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.repositories.DeveloperRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DeveloperServiceImpl implements DeveloperService{

    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DeveloperEntity> getAllDevelopers() {
        return developerRepository.findAll();
    }

    @Override
    public DeveloperEntity getDevById(Long idDev) {
        return developerRepository.findById(idDev).get();
    }

    @Override
    public DeveloperEntity addDev(DeveloperEntity developerEntity) {
        return developerRepository.save(developerEntity);
    }
}
