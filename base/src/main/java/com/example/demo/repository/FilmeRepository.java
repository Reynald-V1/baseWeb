package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.FilmeModel;

public interface FilmeRepository extends JpaRepository<FilmeModel, Integer>{
}