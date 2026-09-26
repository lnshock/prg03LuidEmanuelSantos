/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.livro.entity;

/**
 *
 * @author luids
 */
public class Livro {
    private String nome ;
    private String escritor;
    private String isbn;
    private int quantidade;
    
    public Livro (String nome, String isbn, String escritor){
        this.isbn = isbn;
        this.nome = nome;
        this.escritor = escritor;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEscritor() {
        return escritor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    
}
