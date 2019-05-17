package com.mycompany.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TurmaDTO {
    private String nome;
    private List<AlunoDTO> alunos;
}
