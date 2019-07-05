package com.mycompany.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class DisciplinaDTO {
    private Long id;
    private String nome;
    private TurmaDTO Turma;
    private DocenteDTO docente;
}
