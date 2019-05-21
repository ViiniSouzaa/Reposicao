package com.mycompany.negocio;

import com.mycompany.dao.AlunoDAO;
import com.mycompany.entidade.Aluno;
import com.mycompany.excecao.RaExistenteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class AlunoNegocio extends AbstractNegocio<Aluno>{
    @Autowired
    private AlunoDAO alunoDAO;

    @Override
    public void incluir(Aluno entidade) {
        validaAluno(entidade);
        alunoDAO.save(entidade);
    }

    @Override
    public void alterar(Aluno entidade) {
        validaAluno(entidade);
        alunoDAO.save(entidade);
    }
    
    public void validaAluno(Aluno aluno){
        if(alunoDAO.findAll().stream().anyMatch(c -> c.getRA().equalsIgnoreCase(aluno.getRA()))){
            try {
                throw new RaExistenteException(aluno.getRA());
            } catch (RaExistenteException ex) {
                Logger.getLogger(AlunoNegocio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
    

