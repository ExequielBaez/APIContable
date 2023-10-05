package com.exe.misalario.persistence.repositories;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<DeveloperEntity, Long> {
}
