/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
import java.util.Random;
import java.util.ArrayList;
public class Responder
{
    private Random aleatorio;
    private ArrayList<String> cadena;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        cadena = new ArrayList<>();
        cadena.add("1 Prueba a reiniciar el equipo.");
        cadena.add("2 Tienes que conectar el wifi");
        cadena.add("3 Esta averia está cubierta por la garantia.");
        cadena.add("4 Itroduce el siguiente codigo: 666");
        cadena.add("5 Navegar con Internet Explorer provoca pantallazos azules.");
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
}




















