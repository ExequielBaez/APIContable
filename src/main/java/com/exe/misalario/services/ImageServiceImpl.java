package com.exe.misalario.services;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.entities.ImageEntity;
import com.exe.misalario.persistence.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private DeveloperService developerService;

    @Override
    public ImageEntity findPhotoById(Long id) {
        return imageRepository.findById(id).get();
    }

    @Override
    public ImageEntity savePhoto(MultipartFile file, DeveloperEntity dev) {
        try {
            ImageEntity photo = new ImageEntity();
            photo.setContenido(file.getBytes());
            photo.setDeveloper(dev);
            imageRepository.save(photo);
            return photo;

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
