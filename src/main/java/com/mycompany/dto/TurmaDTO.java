package com.mycompany.dto;

import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TurmaDTO {
    
    private Long id;
    private String nome;
    private Set<AlunoDTO> alunos;
}
