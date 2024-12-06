package br.com.grupohefesto.Medicare.controller;

import br.com.grupohefesto.Medicare.entity.Cuidador;
import br.com.grupohefesto.Medicare.entity.TiposUtilizador;
import br.com.grupohefesto.Medicare.service.CuidadorService;
import br.com.grupohefesto.Medicare.service.TiposUtilizadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("tiposutilizador")
public class TiposUtilizadorController
{
    @Autowired
    private TiposUtilizadorService service;

    @GetMapping
    public List<TiposUtilizador> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public TiposUtilizador buscarPorId(@PathVariable("id") int id){
        return service.buscarPorId(id);
    }
}
