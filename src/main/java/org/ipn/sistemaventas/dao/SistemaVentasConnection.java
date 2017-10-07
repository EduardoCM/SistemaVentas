
package org.ipn.sistemaventas.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SistemaVentasConnection {
    
    
    private Connection con;
    
    public Connection getCon(){
        return con;
    }
    
    public void Conectar(){
        System.out.println("::: Iniciando Conexion");
            String url = "jdbc:derby://localhost:1527/SistemaVentas" ;
            String driver = "org.apache.derby.jdbc.ClientDriver" ;
            String user = "root";
            String password = "root";
        
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            System.out.println("::: Conexion exitosa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
