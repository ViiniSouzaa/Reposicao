/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.negocio;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Reposicao {
    private String motivo;
    private Disciplina disciplina;
    private int numero_aulas;
    private TurnosEnum turno;
    private Date data_prevista;
    private Date data_reposicao;
    private Docente docente;
    private boolean presencial;
    private boolean aprovado;
    private String diarioDeClasse;

    public void setDiarioDeClasse(String diario){
        this.diarioDeClasse = diario + "\nEssa aula sera reposta de forma " + String.valueOf(presencial);
    }
}
