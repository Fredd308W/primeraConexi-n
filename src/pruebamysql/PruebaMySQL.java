package pruebamysql;

/**
 *
 * @author fredy
 */
public class PruebaMySQL {

    public static void main(String[] args) {
        System.out.println("Hola a todos");
        System.out.println("Hola soy Froilan");
        dbConnection dbc = new dbConnection();
        dbc.conectar();
    }
    
}
