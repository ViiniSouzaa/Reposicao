package com.mycompany.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class DocenteDTO {
    
    private Long id;
    private String inscricao;
    private String nome;
}
