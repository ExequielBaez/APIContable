package com.exe.misalario.controllers;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.entities.ImageEntity;
import com.exe.misalario.persistence.entities.UserEntity;
import com.exe.misalario.services.DeveloperService;
import com.exe.misalario.services.ImageService;
import com.exe.misalario.services.ImageServiceImpl;
import com.exe.misalario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.sql.Date;
import java.util.List;
@RestController
@RequestMapping("api/devs")
public class DeveloperController {
        @Autowired
        private DeveloperService developerService;

        @Autowired
        private ImageService imageService;
        @GetMapping
        public ResponseEntity<List<DeveloperEntity>> getListDevs(){
            return ResponseEntity.ok(developerService.getAllDevelopers());
        }
        @GetMapping("/{idDev}")
        public  ResponseEntity<DeveloperEntity> getDev(@PathVariable long idDev){
                DeveloperEntity developerEntity = developerService.getDevById(idDev);
                return ResponseEntity.ok(developerEntity);
        }

        @PostMapping("msg")
        public DeveloperEntity addDev(@RequestBody DeveloperEntity dev) {

         return developerService.addDev(dev);
        }

        @PostMapping("/upload")
        public ImageEntity uploadPhoto(@RequestParam MultipartFile file,
                                       @RequestParam Long idDev){

                DeveloperEntity dev = developerService.getDevById(idDev);

                if(!file.isEmpty()){
                        return imageService.savePhoto(file, dev);
                }else {
                       return null;
                }
        }
}
