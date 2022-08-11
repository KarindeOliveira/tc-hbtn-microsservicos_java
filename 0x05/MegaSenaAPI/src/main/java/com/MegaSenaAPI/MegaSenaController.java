package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

    @RestController
    @RequestMapping(value="/megasena")
    public class MegaSenaController {

        @GetMapping("/simpleMessageWelcome")
        public String mensagemBoasVindas() {
            // TODO
            return "Seja bem vindo";
        }


        @GetMapping("/getNumbers")
        public List<Integer> numerosMegaSena() {
            // TODO
            Random gerador = new Random();
            List<Integer> lista = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                lista.add(gerador.nextInt(100));
            }
            Collections.sort(lista);

            return lista;
        }
    }



