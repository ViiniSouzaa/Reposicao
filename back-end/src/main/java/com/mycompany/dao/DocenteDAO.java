package com.mycompany.dao;

import com.mycompany.entidade.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteDAO extends JpaRepository<Docente, Long>{
    
}
