/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;


/**
 *
 * @author luids
 */
public class ValidarCliente {
   
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
         
         //Return false se as palavras forem diferentes
          return false;
    }
    public static boolean campoVazio(String nome, String telefone, String login, String genero, String email, String cpf,
            String dataNascimento, String senha, String confirmarSenha) {
           
        if (nome.trim().isEmpty() || telefone.trim().isEmpty() || login.trim().isEmpty() ||
            genero.trim().isEmpty() || email.trim().isEmpty() || cpf.trim().isEmpty() ||
            dataNascimento.trim().isEmpty() || senha.trim().isEmpty() || confirmarSenha.trim().isEmpty()) {
            
            return true;
        } else {
            return false;
        }
}
    public static boolean cpfComLetra(String cpf){
        if(!cpf.matches("\\d+")){
            return false;
        }      
            return true;
        
    }
    public static boolean senhaNumCaracteres(String senha){
        if(senha.length()<8){
            return true;
        }
          return false;
    }
}
