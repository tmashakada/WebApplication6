/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mashsoft.entity;

/**
 *
 * @author Software Engineer tmashakada email:tmashakada10@gmail.com
 */
public class Semester {
    
 private    int id;
 private   String semesterdescription; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemesterdescription() {
        return semesterdescription;
    }

    public void setSemesterdescription(String semesterdescription) {
        this.semesterdescription = semesterdescription;
    }
    
}
