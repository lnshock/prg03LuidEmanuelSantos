
import br.com.ifba.compra.entity.Compra;
import br.com.ifba.funcionario.entity.Funcionario;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luids
 */
public class FuncionarioTest {
    @Test
    public void deveRetornarTextoComZeroVendasQuandoListaEstiverVazia(){
        //Arrange
        Funcionario usuario = new Funcionario();

        //Act
        String resultado = usuario.numeroDeTrasacoes();

        //Assert
        assertEquals("Numero de livros vendidos: 0", resultado);
    }

    @Test
    public void deveRetornarTextoComQuantidadeCorretaDeVendas(){
        //Arrange
        Funcionario usuario = new Funcionario();
        usuario.getTransacoesFeitas().add(new Compra());
        usuario.getTransacoesFeitas().add(new Compra());

        //Act
        String resultado = usuario.numeroDeTrasacoes();

        //Assert
        assertEquals("Numero de livros vendidos: 2", resultado);
    }
}
