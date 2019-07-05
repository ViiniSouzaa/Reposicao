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
public class Aluno implements Serializable {
    
    @Id @GeneratedValue
    private Long id;
    private String RA;
    private String nome;
    
    @ManyToMany
    private Set<Turma> turmas;
}
