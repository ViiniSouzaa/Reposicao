/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReposicaoDTO {
    
    private Long id;
    private String motivo;
    private DisciplinaDTO disciplina;
    //utilizar lowerCamel
    private int numero_aulas;
    private TurnosEnum turno;
    //utilizar lowerCamel
    private DataAulaDTO data_prevista;
    //utilizar lowerCamel
    private DataAulaDTO data_reposicao;
    private DocenteDTO docente;
    private boolean presencial;
    private boolean aprovado;
    private String diarioDeClasse;

    public void setDiarioDeClasse(String diario){
        this.diarioDeClasse = diario + "\nEssa aula sera reposta de forma " + String.valueOf(presencial);
    }
}
