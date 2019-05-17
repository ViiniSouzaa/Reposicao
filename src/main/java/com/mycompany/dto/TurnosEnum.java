package com.mycompany.dto;

public enum TurnosEnum {
    Manha(1),
    Tarde(2),
    Noite(3);
    
    private final int turno;
    TurnosEnum(int valor){
        turno = valor;
    }
}

