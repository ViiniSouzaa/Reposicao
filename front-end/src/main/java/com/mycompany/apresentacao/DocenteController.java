package com.mycompany.apresentacao;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Vinicius
 */
@Controller
public class DocenteController {

    @GetMapping("/docente")
    public String inicia(Model data) throws JsonSyntaxException, UnirestException {
        DocenteModel arrayDocentes[] = new Gson()
                .fromJson(
                    Unirest
                        .get("http://localhost:8080/servico/docente")
                        .asJson()
                        .getBody()
                        .toString(),
                    DocenteModel[].class
                );
        
        data.addAttribute("docentes", arrayDocentes);
        
        return "docente-view";
    }
    
    @PostMapping("/docente/cria")
    public String cria(DocenteModel docente) throws UnirestException {
        
        Unirest.post("http://localhost:8080/servico/docente")
                .header("Content-type", "application/json")
                .header("accept", "application/json")
                .body(new Gson().toJson(docente, DocenteModel.class))
                .asJson();
        
        return "redirect:/pais";
    }
    
    @GetMapping ("/docente/excluir")
    public String excluir (@RequestParam int id) throws UnirestException {

        Unirest
            .delete("http://localhost:8080/servico/docente/{id}")
            .routeParam("id", String.valueOf(id))
            .asJson();

        return "redirect:/docente";
    }
    
    @GetMapping ("/docente/prepara-alterar")
    public String preparaAlterar (@RequestParam int id, Model data) throws JsonSyntaxException, UnirestException {

        DocenteModel docenteEncontrado = new Gson()
            .fromJson(
                Unirest
                    .get("http://localhost:8080/servico/docente/{id}")
                    .routeParam("id", String.valueOf(id))
                    .asJson()
                    .getBody()
                    .toString(),
                DocenteModel.class
            );

        data.addAttribute("docenteAtual", docenteEncontrado);

        DocenteModel arrayDocentes[] = new Gson()
        .fromJson(
            Unirest
                .get("http://localhost:8080/servico/docente")
                .asJson()
                .getBody()
                .toString(), 
            DocenteModel[].class
        );

        data.addAttribute("docentes", arrayDocentes);

        return "docente-view-alterar";
    }
    
    @PostMapping ("/docente/alterar")
    public String alterar (DocenteModel docenteAlterado) throws UnirestException {

        Unirest
            .put("http://localhost:8080/servico/docente/{id}")
            .routeParam("id", String.valueOf(docenteAlterado.getId()))
            .header("Content-type", "application/json")
            .header("accept", "application/json")
            .body(new Gson().toJson(docenteAlterado, DocenteModel.class))
            .asJson();

        return "redirect:/docente";
    }
}
