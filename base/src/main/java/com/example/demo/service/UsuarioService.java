package com.example.demo.service;

import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private UserRepository repo;

        public UsuarioService(UserRepository repository) {
            this.repo = repository;
        }

        public UserModel create(UserModel u){
            return repo.save(u);
        }

        public void delete(int id){
            repo.deleteById(id);
        }

        public UserModel update(UserModel u){
            return  repo.saveAndFlush(u);
        }

        public UserModel findById(int id){

            Optional<UserModel> UserOptional = repo.findById(id);

            return UserOptional.orElse(null);
        }

        public List<UserModel> findAll(){
            return repo.findAll();
        }
    }

