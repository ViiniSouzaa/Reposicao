/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.negocio;

/**
 *
 * @author Vinicius
 */
public enum TurnosEnum {
    Manha(1),
    Tarde(2),
    Noite(3);
    
    private final int turno;
    TurnosEnum(int valor){
        turno = valor;
    }
}

