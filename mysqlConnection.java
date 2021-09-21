
package online.car.rent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class mysqlConnection {
    
    Connection c;
    Statement s;
    
    mysqlConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///ahsan_grocery_shop","root","anikaaa1998");
            s=c.createStatement();
            
        }
        catch(Exception e ){
            e.printStackTrace();
            
        }
    }
    
    
}
