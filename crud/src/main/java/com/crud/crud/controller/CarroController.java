package com.crud.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.entity.Carro;
import com.crud.crud.service.CarroService;

@RestController
@RequestMapping("/api/carro")
public class CarroController {
    @Autowired
    private CarroService carroService;

    @PostMapping("/save")
    public String save(@RequestBody Carro carro){
        return "Carro salvo com sucesso!";
    }

    @PutMapping("/update/{id}")  
    public String update(@RequestBody Carro carro, @PathVariable long id){
        return "carro foi atualizado com sucesso";
    }

    @DeleteMapping("/delete/{id}")
    public String delete (@PathVariable Long id) {
        return "carro deletado";
    }

    @GetMapping("/findAll")
    public List<Carro> findAll(){
        return null;
    }

    @GetMapping("/findById/{id}")
    public Carro findById(@PathVariable Long id){
        return null;
    }
}
