package com.mycompany.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AlunoDTO {
    private String RA;
    private String nome;
}
