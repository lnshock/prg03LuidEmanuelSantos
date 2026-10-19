package br.com.ifba.pessoa.entity;

import br.com.ifba.cliente.entity.Cliente;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepositorioPessoaEmMemoriaTest {

    private RepositorioPessoaEmMemoria repositorio;

    @BeforeEach
    public void setUp() {
        // Arrange comum: reinicia o repositório antes de cada teste
        repositorio = new RepositorioPessoaEmMemoria();
    }

    @Test
    public void deveAparecerEmListarQuandoCadastrarUsuario() {
        // Arrange
        Cliente cliente = new Cliente("Luid", "12345678900", "luid", "senha123");

        // Act
        repositorio.cadastrar(cliente);
        List<Pessoa> todas = repositorio.listar();

        // Assert
        assertEquals(1, repositorio.tamanhoLista());
        assertTrue(todas.contains(cliente));
    }

    @Test
    public void deveDevolverUsuarioCertoQuandoCadastrarDoisEBuscarPorLogin() {
        // Arrange
        Cliente cliente1 = new Cliente("Luid", "12345678900", "luid", "senha123");
        Cliente cliente2 = new Cliente("Maria", "98765432100", "maria", "senha456");

        repositorio.cadastrar(cliente1);
        repositorio.cadastrar(cliente2);

        // Act
        Pessoa resultado = repositorio.buscaPorLogin("maria");

        // Assert
        assertNotNull(resultado);
        assertEquals("maria", resultado.getLogin());
        assertEquals("Maria", resultado.getNome());
    }

    @Test
    public void deveRetornarNullQuandoBuscarPorLoginInexistente() {
        // Arrange
        Cliente cliente = new Cliente("Luid", "12345678900", "luid", "senha123");
        repositorio.cadastrar(cliente);

        // Act
        Pessoa resultado = repositorio.buscaPorLogin("login_inexistente");

        // Assert
        assertNull(resultado);
    }

    @Test
    public void deveConsiderarIguaisParaListaObjetosDiferentesComMesmoCpf() {
        // Arrange: dois objetos distintos com o mesmo CPF (utilizado pelo equals da classe Pessoa)
        Cliente clienteOriginal = new Cliente("Luid Emanuel", "12345678900", "luid", "senha123");
        Cliente clienteMesmoCpf = new Cliente("Outro Nome", "12345678900", "outroLogin", "outraSenha");

        repositorio.cadastrar(clienteOriginal);

        // Act
        List<Pessoa> todas = repositorio.listar();

        // Assert
        assertEquals(clienteOriginal, clienteMesmoCpf);
        assertTrue(todas.contains(clienteMesmoCpf));
    }
}