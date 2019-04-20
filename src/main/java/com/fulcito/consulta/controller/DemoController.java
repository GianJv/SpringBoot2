/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fulcito.consulta.controller;

import com.fulcito.consulta.model.Person;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alfredo
 */
@RestController
@RequestMapping("/api/v1/person")
public class DemoController {
    
    @GetMapping("/edit")
    public String getHello(){
        return "HolaFull";
    }
    @GetMapping("/recuperar")
    public String getRecuperar(@RequestParam Integer id){
        return "Hola " + id;
    }
    
    @GetMapping("/recuperar/url/{id}")
    public Person getRecuperarPorURL(@PathVariable("id") Integer id){
        
        Person p = new Person();
        p.setId(id);
        p.setName("full");
        
        return p;
    }
    
    @PostMapping("/metodoPost")
    public String postExample(){
        return "HolaFull";
    }
}
