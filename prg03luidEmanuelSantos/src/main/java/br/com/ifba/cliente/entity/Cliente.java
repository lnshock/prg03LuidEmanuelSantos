/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.cliente.entity;


import br.com.ifba.cliente.interfaces.Autenticavel;
import br.com.ifba.pessoa.entity.GeneroPessoa;
import br.com.ifba.pessoa.entity.Pessoa;

/**
 *
 * @author luids
 */
public class Cliente extends Pessoa implements Autenticavel {
      
  
     //Construtor sem parametros
    public Cliente() {
    }
    //Construtor com parametros
      public Cliente(String nome, String cpf, String login, String senha) {
        setNome(nome);
        setCpf(cpf);
        setLogin(login);
        setSenha(senha);
       
    }

   
    
}
