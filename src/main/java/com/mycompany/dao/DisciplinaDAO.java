package com.mycompany.dao;

import com.mycompany.entidade.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaDAO extends JpaRepository<Disciplina, Long>{
    
}
