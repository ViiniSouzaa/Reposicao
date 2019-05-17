package com.mycompany.dao;

import com.mycompany.entidade.Reposicao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReposicaoDAO extends JpaRepository<Reposicao, Long>{
    
}
