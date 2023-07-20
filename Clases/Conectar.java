
package Clases;


import java.sql.Connection;



public class Conectar {
    
    Connection cn;
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
             cn=DriverManager.getConnetion("jdbc:mysql://localhost/bd","root","");
        System.out.println("conectado");
            
        } catch (Exception ex) {
               System.out.println(e.getMessaege());
        }
      
        return cn;
        
    } 

    private static class DriverManager {

        private static Connection getConnetion(String jdbcmysqllocalhostbd, String root, String string) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }

    private static class e {

        private static boolean getMessaege() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public e() {
        }
    }
 }
    

