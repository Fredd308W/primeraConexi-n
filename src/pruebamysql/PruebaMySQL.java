package pruebamysql;

/**
 *
 * @author fredy
 */
public class PruebaMySQL {

    public static void main(String[] args) {
        System.out.println("Hola a todos");
        dbConnection dbc = new dbConnection();
        dbc.conectar();
    }
    
}
