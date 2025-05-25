package com.crud.crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.crud.entity.Carro;

@Service
public class CarroService {
    
    public String save(Carro carro){
        return "Carro salvo com sucesso!";
    }

    public String update(Carro carro, long id){
        return "carro foi atualizado com sucesso";
    }

    public String delete (Long id) {
        return "carro deletado";
    }

    public List<Carro> findAll(){
        return null;
    }

    public Carro findById(Long id){
        return null;
    }
}
