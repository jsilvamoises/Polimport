/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsilvamoises.polilog.controller;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author MOISES
 */
@ManagedBean
@RequestScoped
public class TesteController {
    private List<Integer> lista;
    public TesteController(){
        lista = new ArrayList<>();
        for(int i= 0;i<50;i++){
            lista.add(i);
        }
        
    }
    
    public List<Integer> getPedidos(){
        return lista;
    }
    
}
