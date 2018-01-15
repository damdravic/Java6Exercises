/*
 * Class with main methode
 */
package javadbclass;

import firstdb.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dragos
 */
public class FirstConnectionTest1 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {

        Connection connection = MyConnection.getConnection();
        Statement statement= null; 
        ResultSet resultSet = null; 
   
    
       
       statement = connection.createStatement(); 
              //statement.execute("CREATE TABLE FIRSTTABLE (ID INT PRIMARY KEY, NAME VARCHAR(12))"); 
              //statement.execute("INSERT INTO FIRSTTABLE VALUES (10,'TEN'),(20,'TWENTY'),(30,'THIRTY')"); 
        resultSet = statement.executeQuery("SELECT * FROM FIRSTTABLE");
         
        
                String currentID = ""; 
                String currentName = ""; 
                System.out.println("ID    NAME"); 
                System.out.println("=========="); 
                while(resultSet.next()){ 
                    currentID = resultSet.getString(1); 
                    currentName = resultSet.getString(2);  
                    System.out.println(currentID + "     " +currentName);
        
                }
        
        
    }
    
}
