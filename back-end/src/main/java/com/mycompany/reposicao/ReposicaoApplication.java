package com.mycompany.reposicao;

import com.mycompany.dao.DocenteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReposicaoApplication {

    private final DocenteDAO docenteDAO;

    @Autowired
    public ReposicaoApplication(DocenteDAO docenteDAO) {
        this.docenteDAO = docenteDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(ReposicaoApplication.class, args);
    }

}
