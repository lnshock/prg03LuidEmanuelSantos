/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.pessoa.entity;

import br.com.ifba.pessoa.entity.Pessoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author luids
 */
public class RepositorioPessoaEmMemoria {
    private final List<Pessoa> pessoas = new ArrayList<>();
    private final Map<String, Pessoa> porLogin = new HashMap<>();
    
    public Pessoa buscaPorLogin (String login){
       Pessoa pessoa = porLogin.get(login);
       
       for (Pessoa p : pessoas) {
        if (p.getLogin().equals(login)) {
           return p;
        }
       }
         return pessoa;
  }
    
    
    public void cadastrar(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public List<Pessoa> listar(){
        return pessoas;
    }
    public int tamanhoLista(){
        return pessoas.size();
    }
}
