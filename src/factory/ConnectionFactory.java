/**
 *
 * @author adison
 */

//situa em qual package ou "pacote" esta a clase 
package factory;
//faz as importações de classes necessárias para o funcionamento doprograma
import java.sql.Connection; //conexãoSQL para java
import java.sql.DriverManager; //driver  de conexão SQL para Java
import java.sql.SQLException;// classe para tratamento de exceções

public class ConnectionFactory {
    public Connection getConnection(){
   try {
      return DriverManager.getConnection("jdbc:mysql://localhost/projetojava", "root", "root");  
    }
   catch(SQLException excecao){
       throw new RuntimeException (excecao);
   }
    }
}

  
