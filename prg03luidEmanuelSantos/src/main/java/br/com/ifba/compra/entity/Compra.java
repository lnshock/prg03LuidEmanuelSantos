/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.compra.entity;
import br.com.ifba.cliente.entity.Cliente;
import br.com.ifba.livro.entity.Livro;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author luids
 */
public class Compra {
    private float valor;
    private Cliente comprador;
    private List<Livro> livros = new ArrayList<>();
   
    public void adicionarLivro(Livro l){
        livros.add(l);
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public float getValor() {
        return valor;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public List<Livro> getLivros() {
        return livros;
    }
    
    
}
