package com.mycompany.dao;

import com.mycompany.entidade.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaDAO extends JpaRepository<Turma, Long>{
    
}
