package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UsuarioController {
    @GetMapping("/registrar")
    public String usuariocontroller(HttpServletRequest request, HttpServletResponse response){
        return "cadastro";
    }

}

