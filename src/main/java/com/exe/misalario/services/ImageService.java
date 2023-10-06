package com.exe.misalario.services;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.entities.ImageEntity;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    public ImageEntity findPhotoById(Long id);

    public ImageEntity savePhoto(MultipartFile file, DeveloperEntity dev);
}
