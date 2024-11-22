package br.com.grupohefesto.Medicare.service;

import br.com.grupohefesto.Medicare.entity.Utilizador;
import br.com.grupohefesto.Medicare.repository.UtilizadorRepository;
import jdk.jshell.execution.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilizadorService
{
    @Autowired
    private UtilizadorRepository repository;

    //Listar Utilizadores
    public List<Utilizador> listar()
    {
        return repository.findAll();
    }
    //Buscar por Id
    public Utilizador buscarPorId(Long id)
    {
        var existe = repository.findById(id);
        if(existe.isPresent())
            return existe.get();
        return null;
    }

    //Cadastra utilizador
    public Utilizador cadastrar (Utilizador utilizador)
    {
       return repository.save(utilizador);
    }

    //Alterar utilizador
    public Utilizador alterar(Utilizador utilizador)
    {
        var existe = buscarPorId(utilizador.getId());
        if ( existe != null)
            return repository.save(utilizador);
        else
        {
            System.out.println("Usuário não encontrado");
            return null;
        }
    }

    //Deletar um Utilizador
    public void excluir(Long id)
    {
        var existe = buscarPorId(id);
        if (existe != null)
            repository.deleteById(id);
    }




}