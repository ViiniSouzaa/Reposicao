package com.mycompany.servico;

import com.mycompany.dao.DocenteDAO;
import com.mycompany.entidade.Docente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicoDocente {
    private final DocenteDAO docenteDAO;
    
    @Autowired
    public ServicoDocente(DocenteDAO docenteDao){
        docenteDAO = docenteDao; 
    }
    
    @GetMapping ("/servico/docente")
    public ResponseEntity<List<Docente>> listar(){
        return ResponseEntity.ok(docenteDAO.findAll());
    }
    
    @GetMapping ("/servico/docente/{id}")
    public ResponseEntity<Docente> listarPorId(@PathVariable Long id){
        return ResponseEntity.of(docenteDAO.findById(id));
    }
    
    @PostMapping ("/servico/docente")
    public ResponseEntity<Docente> criar (@RequestBody Docente docente){
        docenteDAO.save(docente);
        return ResponseEntity.status(201).body(docente);
    }
    
    @DeleteMapping ("/servico/docente/{id}")
    public ResponseEntity excluir (@PathVariable Long id) {
        if(docenteDAO.findById(id).isPresent()){
            docenteDAO.deleteById(id);
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @PutMapping ("/servico/docente/{id}")
    public ResponseEntity<Docente> alterar (@PathVariable Long id, @RequestBody Docente docente){
        Optional<Docente> docenteEncontrado = docenteDAO.findById(id);
        
        docenteEncontrado.ifPresent(d -> {
            d.setInscricao(docente.getInscricao());
            d.setNome(docente.getNome());
            docenteDAO.save(d);
        });
        
        return ResponseEntity.of(docenteEncontrado);
    }
}
