
import br.com.ifba.compra.entity.Compra;
import br.com.ifba.livro.entity.Livro;
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
public class CompraTest {
        @Test
    public void AdicionarLivroDeveAumentarONumDeElementos(){
        //Arrange
        Compra compra = new Compra();
        Livro livro = new Livro("Harry Potter", "112233", "Amsterdam");
 
        //Act
        compra.adicionarLivro(livro);
 
        //Assert
        assertEquals(1,compra.getLivros().size());
    }
    
}
