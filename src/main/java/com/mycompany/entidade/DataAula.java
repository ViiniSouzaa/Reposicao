package com.mycompany.entidade;

import com.mycompany.dto.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DataAula implements Serializable {
    
    @Id @GeneratedValue
    private Long id;
    private Date dataAula;
    //faltou anotação @Enumerated (EnumType.STRING) para retornar a String do Enum
    private List<HorarioAula> aulas;
}
