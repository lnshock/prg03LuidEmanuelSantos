package br.com.ifba.cliente.entity;

import br.com.ifba.cliente.interfaces.Autenticavel;
import br.com.ifba.compra.entity.Compra;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author luids
 */
public class ClienteTest {

    @Test
    void clienteAutenticaPeloProprioCanal() {
        Autenticavel pessoa = new Cliente("Luid", "12345678", "login123", "senha123"); // tipo geral à esquerda
        assertEquals("Cliente autenticado: login123", pessoa.autenticar("login123", "senha123"));
    }

    @Test
    void deveRetornarTextoComZeroComprasQuandoListaEstiverVazia() {
        Cliente usuario = new Cliente("Luid", "12345678", "login123", "senha123");
        assertEquals("Numero de compras realizadas: 0", usuario.numeroDeTrasacoes());
    }

    @Test
    void deveRetornarTextoComQuantidadeCorretaDeCompras() {
        Cliente usuario = new Cliente("Luid", "12345678", "login123", "senha123");
        usuario.getTransacoesFeitas().add(new Compra());
        usuario.getTransacoesFeitas().add(new Compra());
        assertEquals("Numero de compras realizadas: 2", usuario.numeroDeTrasacoes());
    }
}