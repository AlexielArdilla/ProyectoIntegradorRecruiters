
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eldio
 */
public class TestMySqlJDBC {
    
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/alumnos?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                Connection conexion = DriverManager.getConnection(url,"root", "CAlor1246*");
                Statement instrtuccion = conexion.createStatement();
                String sql = "select * from alumno;";
                ResultSet resultado = instrtuccion.executeQuery(sql);
                
                while(resultado.next()){
                
                    System.out.println("Id "+ resultado.getInt(1) + "Legajo: "+resultado.getInt(2)+
                            " DNI "+resultado.getInt(3)+ " Nombre Y Apel: "+ resultado.getString(4)+
                            " Email: "+ resultado.getString(5)+ " Genero: "+resultado.getString(6)+
                            " acciones: "+resultado.getString(7));
                
                }
                
                resultado.close();
                instrtuccion.close();
                conexion.close();
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
}
