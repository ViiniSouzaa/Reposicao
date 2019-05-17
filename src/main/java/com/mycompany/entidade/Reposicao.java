package com.mycompany.entidade;

import com.mycompany.dto.*;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Reposicao implements Serializable {
    
    @Id @GeneratedValue
    private Long id;
    private String motivo;
    @ManyToOne
    private Disciplina disciplina;
    private int numero_aulas;
    @Enumerated (EnumType.STRING)
    private TurnosEnum turno;
    @OneToOne
    private DataAula data_prevista;
    @OneToOne
    private DataAula data_reposicao;
    private boolean presencial;
    private boolean aprovado;
    private String diarioDeClasse;
}
