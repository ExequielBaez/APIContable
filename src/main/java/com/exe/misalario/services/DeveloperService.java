package com.exe.misalario.services;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.entities.UserEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DeveloperService {

    public List<DeveloperEntity> getAllDevelopers();

    public DeveloperEntity getDevById(Long idDev);

    public DeveloperEntity addDev(DeveloperEntity developerEntity);

    }
