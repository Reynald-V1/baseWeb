package com.example.demo.service;

import com.example.demo.model.FilmeModel;
import org.springframework.stereotype.Service;
import com.example.demo.repository.FilmeRepository;


import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {
    private FilmeRepository repo;

        public FilmeService(FilmeRepository repository) {
            this.repo = repository;
        }

        public FilmeModel create(FilmeModel f){
            return repo.save(f);
        }

        public void delete(int id){
            repo.deleteById(id);
        }

        public FilmeModel update(FilmeModel f){
            return  repo.saveAndFlush(f);
        }

        public FilmeModel findById(int id){

            Optional<FilmeModel> filmeOptional = repo.findById(id);

            return filmeOptional.orElse(null);
        }

        public List<FilmeModel> findAll(){
            return repo.findAll();
        }
}
