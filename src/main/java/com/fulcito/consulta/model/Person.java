/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fulcito.consulta.model;

/**
 *
 * @author Alfredo
 */
public class Person {
    private Integer id;
    private String name;
    private String fatherName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
