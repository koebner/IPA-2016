package estructurasCiclos;

/**
 * Created by e-okcenter on 26/01/2016.
 */
public class cicloWhile {
    //Validacion de ciclo While
    public static void main(String[] args)
    {
        int digitoEntero = 15, inicializador = 2;
        int contador=1;

        while (digitoEntero < 30)
        {

            System.out.println("el numero " + digitoEntero + " se repite " + contador );
            digitoEntero++;
            contador++;

        }




    }
}
