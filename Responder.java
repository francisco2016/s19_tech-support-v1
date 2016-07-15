/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> cadena;
    private HashMap<String,String> cadena2;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<>();
        cadena2 = new HashMap<>();
        cadena.add( "1 Prueba a reiniciar el equipo.");
        cadena.add( "2 Tienes que conectar el wifi");
        cadena.add( "3 Esta averia está cubierta por la garantia.");
        cadena.add( "4 Itroduce el siguiente codigo: 666");
        cadena.add( "5 Navegar con Internet Explorer provoca pantallazos azules.");
        cadena2.put("Iconos","1 Prueba a reiniciar el equipo.");
        cadena2.put("Red","2 Tienes que conectar el wifi");
        cadena2.put("Precio","3 Esta averia está cubierta por la garantia.");
        cadena2.put("Contraseña","4 Itroduce el siguiente codigo: 666");
        cadena2.put("Azul","5 Navegar con Internet Explorer provoca pantallazos azules.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numSol = cadena.size();
        return cadena.get(aleatorio.nextInt(numSol));
    }

    /**
     * para devolver respuesta en caso de que el cliente conteste con una palabra clave
     */ 
    public String respuestaClave(String palabra){
        return cadena2.get(palabra);
    }
}


















