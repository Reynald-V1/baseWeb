package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class FilmeController {
        @GetMapping("/")
        public void filmecontroller(HttpServletRequest request, HttpServletResponse response) throws IOException {

        }

}
