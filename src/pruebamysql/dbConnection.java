package pruebamysql;
import java.sql.*;

/**
 *
 * @author fredy
 */
public class dbConnection {
    static String url = "jdbc:mysql://localhost:3306/ejemplo1";
    static String user = "root";
    static String password = "";
    
    public static Connection conectar(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Exitosa");
        }
        catch(SQLException e){
           e.printStackTrace();
        }
        return con;
    }
}
