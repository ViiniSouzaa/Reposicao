package com.mycompany.entidade;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Turma implements Serializable {
    
    @Id @GeneratedValue
    private Long id;
    private String nome;
    
    @ManyToMany
    private Set<Aluno> alunos;
}
