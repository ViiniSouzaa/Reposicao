package com.mycompany.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class DocenteDTO {
    private String inscricao;
    private String nome;
}
