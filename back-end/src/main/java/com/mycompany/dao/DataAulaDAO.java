package com.mycompany.dao;

import com.mycompany.entidade.DataAula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataAulaDAO extends JpaRepository<DataAula, Long>{
    
}
