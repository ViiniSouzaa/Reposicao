package com.mycompany.dto;

import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataAulaDTO {
    
    private Long id;
    private Date dataAula;
    private List<HorarioAula> aulas;
}
