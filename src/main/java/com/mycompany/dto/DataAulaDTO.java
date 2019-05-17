package com.mycompany.dto;

import java.util.Date;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataAulaDTO {
    Date dataAula;
    List<HorarioAula> aulas;
}
