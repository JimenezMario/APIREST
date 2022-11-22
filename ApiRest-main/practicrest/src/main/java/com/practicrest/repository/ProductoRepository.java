package com.practicrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicrest.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
