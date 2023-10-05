package com.exe.misalario.controllers;

import com.exe.misalario.persistence.entities.DeveloperEntity;
import com.exe.misalario.persistence.entities.UserEntity;
import com.exe.misalario.services.DeveloperService;
import com.exe.misalario.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.sql.Date;
import java.util.List;
@RestController
@RequestMapping("api/devs")
public class DeveloperController {
        @Autowired
        private DeveloperService developerService;
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
        public DeveloperEntity addDev(@RequestParam String nombre,
                              @RequestParam String apellido,
                              @RequestParam String email,
                              @RequestParam String nacionalidad,
                              @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaNacimiento,
                              @RequestParam String password,
                              @RequestParam String newpassword,
                              @RequestParam String genero,
                              @RequestParam String telefono,
                              @RequestParam Double salario,
                              @RequestParam String seniority,
                              @RequestParam String especialidad,
                              @RequestParam String descripcion) {

         return developerService.addDev();
        }

}
