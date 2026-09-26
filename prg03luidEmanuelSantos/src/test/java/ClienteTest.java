/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luids
 */
import br.com.ifba.cliente.entity.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class ClienteTest {
    @Test
    public void deveAutenticarQuandoCredenciaisCorretas(){
        //Arrange
        Cliente usuario = new Cliente("Luid", "12345678", "login123", "senha123");
 
        //Act
        boolean resultado = usuario.autenticar("login123", "senha123");
 
        //Assert
        assertTrue(resultado);
    }
 
    @Test
    public void naoDeveAutenticarQuandoCredenciaisIncorretas(){
        //Arrange
        Cliente usuario = new Cliente("Luid", "12345678", "login123", "senha123");
 
        //Act
        boolean resultado = usuario.autenticar("login123", "senhaErrada");
 
        //Assert
        assertFalse(resultado);
    }
}
