package pruebamysql;

/**
 *
 * @author fredy
 */
public class PruebaMySQL {

    public static void main(String[] args) {
        System.out.println("Hola a Todos :D");
        System.out.println("Hola 2");
        dbConnection dbc = new dbConnection();
        dbc.conectar();
    }
    
}
