package com.dmgmodels.lojaRoupas.controller;

import com.dmgmodels.lojaRoupas.model.DadosCadastroRoupa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepositorio roupaRepositorio;


    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepositorio.save(new Roupa(dados));

    }

    @GetMapping
    public List<Roupa> ListarProdutos(){
        return roupaRepositorio.findAll();


    }
}
