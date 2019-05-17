package com.mycompany.dao;

import com.mycompany.entidade.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDAO extends JpaRepository<Aluno, Long>{
    
}
