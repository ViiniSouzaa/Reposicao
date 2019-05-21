/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.negocio;

import com.mycompany.entidade.Aluno;

/**
 *
 * @author Vinicius
 */
public abstract class AbstractNegocio<T> {
    
    public abstract void incluir(T entidade);
    
    public abstract void alterar(T entidade);
    
}
