package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.AlertaRemedio;
import br.com.grupohefesto.Medicare.entity.TiposUtilizador;
import br.com.grupohefesto.Medicare.repository.TiposUtilizadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiposUtilizadorService
{
    @Autowired
    private TiposUtilizadorRepository repository;


    public List<TiposUtilizador> listar(){
        return repository.findAll();
    }

    public TiposUtilizador buscarPorId(int id){
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }
}