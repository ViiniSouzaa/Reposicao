package com.mycompany.apresentacao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocenteModel {
    private Long id;
    private String inscricao;
    private String nome;
}
