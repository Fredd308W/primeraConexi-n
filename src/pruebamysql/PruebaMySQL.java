package pruebamysql;

/**
 *
 * @author fredy
 */
public class PruebaMySQL {

    public static void main(String[] args) {
        System.out.println("Hola a Todos :D");
        dbConnection dbc = new dbConnection();
        dbc.conectar();
    }
    
}
