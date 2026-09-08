/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;

/**
 *
 * @author luids
 */
public class ValidarUsuario {
   
    public static boolean contemPalavraProibida(String texto){
       //Cria o array com as palavras proibidas
        String palavrasProibidas[] = {"admin","teste","root","senha123"};
        //Usando o for each para percorrer o array
       for (String palavra: palavrasProibidas){
           // retorn true se as palavras foram iguais   
           if(texto.equals(palavra)){
                 return true; 
               
             }
        }
         //Retorn false se as palavras forem diferentes
          return false;
    }
}
