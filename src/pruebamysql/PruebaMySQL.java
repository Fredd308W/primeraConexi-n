package pruebamysql;

/**
 *
 * @author fredy
 */
public class PruebaMySQL {

    public static void main(String[] args) {
        System.out.println("Hola a Todos :D");
        System.out.println("Hola 2");
        System.out.println("Hola 3");
        dbConnection dbc = new dbConnection();
        dbc.conectar();
    }
    
}
