package com.exe.misalario.persistence.repositories;

import com.exe.misalario.persistence.entities.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Long> {
}
