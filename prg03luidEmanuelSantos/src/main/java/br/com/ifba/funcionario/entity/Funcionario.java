/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcionario.entity;

import br.com.ifba.cliente.interfaces.Autenticavel;
import br.com.ifba.pessoa.entity.Pessoa;

/**
 *
 * @author luids
 */
public class Funcionario extends Pessoa implements Autenticavel{
    //Modificando a classe herdada de acordo com a necessidade da classe filha
    @Override
    public  String numeroDeTrasacoes(){
         return ("Numero de livros vendidos: "+ transacoesFeitas.size() );
    }
    
   
}
