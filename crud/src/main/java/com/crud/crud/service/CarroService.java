package com.crud.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.crud.entity.Carro;
import com.crud.crud.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;
    
    public String save(Carro carro){
        this.carroRepository.save(carro);
        return "Carro salvo com sucesso!";
    }

    public String update(Carro carro, long id){
        carro.setId(id);
        this.carroRepository.save(carro);
        return "carro foi atualizado com sucesso";
    }

    public String delete (Long id) {
        this.carroRepository.deleteById(id);
        return "carro deletado";
    }

    public List<Carro> findAll(){
        List<Carro> lista = this.carroRepository.findAll();
        return lista;
    }

    public Carro findById(Long id){
        Carro carro = this.carroRepository.findById(id).get();
        return carro;
    }
}
