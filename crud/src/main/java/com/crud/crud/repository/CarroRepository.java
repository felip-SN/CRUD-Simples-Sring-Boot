package com.crud.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entity.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
