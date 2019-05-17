package com.mycompany.dto;

import com.mycompany.entidade.Turma;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlunoDTO {
    
    private Long id;
    private String RA;
    private String nome;
    private Set<TurmaDTO> turmas;
}
