/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.cliente.interfaces;

/**
 *
 * @author luids
 */
public interface Autenticavel {
    String autenticar(String login, String senha);
    String processar(Autenticavel pessoa, String login, String senha);
         
    
}

