package pruebamysql;

/**
 *
 * @author fredy
 */
public class PruebaMySQL {

    public static void main(String[] args) {

        dbConnection dbc = new dbConnection();
        dbc.conectar();
    }
    
}
