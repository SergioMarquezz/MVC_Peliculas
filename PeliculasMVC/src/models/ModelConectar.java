/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModelConectar {
    
    private Connection conexion;
    private Statement stm;
    
    public Connection getConexion(){
        
        return conexion;
    }
    
    public void conectarBD(){
        
        try{
           conexion = DriverManager.getConnection("jdbc:mysql://localhost/peliculas","root","sergioalberto");
           stm = conexion.createStatement();
            
           
            
        }catch(SQLException ex){
            
            JOptionPane.showMessageDialog(null, "Error 101" + ex.getMessage());
        }
        
    }
   
   
}
