package com.mycompany.negocio;

import com.mycompany.dao.DocenteDAO;
import com.mycompany.entidade.Docente;
import com.mycompany.excecao.InscricaoJaExistenteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class DocenteNegocio extends AbstractNegocio<Docente>{
    
    @Autowired
    DocenteDAO docenteDAO;

    @Override
    public void incluir(Docente entidade) {
        validaDocente(entidade);
        docenteDAO.save(entidade);
    }

    @Override
    public void alterar(Docente entidade) {
        validaDocente(entidade);
        docenteDAO.save(entidade);        
    }
    
    public void validaDocente(Docente docente){
        if(docenteDAO.findAll().stream().anyMatch(c -> c.getInscricao().equalsIgnoreCase(docente.getInscricao()))){
            try {
                throw new InscricaoJaExistenteException(docente.getInscricao());
            } catch (InscricaoJaExistenteException ex) {
                Logger.getLogger(AlunoNegocio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
