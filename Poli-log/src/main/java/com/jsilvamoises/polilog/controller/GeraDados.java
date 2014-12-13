/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsilvamoises.polilog.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;




/**
 *
 * @author Moises
 */
@ManagedBean
public class GeraDados {
    private List<Integer> lista;
    public List getLista(){
        lista = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            lista.add(i);
        }
        return lista;
    }
    
    
}
