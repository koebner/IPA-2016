package variablesYTipos;

/**
 * Created by e-okcenter on 25/01/2016.
 */
public class appTYV {

    public static void main(String[] args) { //Estructura principal del proyecto

        //tipo de constante
        final int dias = 9632;

        // tipo de dato
        int entero;
        boolean elige;
        String soyUnaPalabra;
        float soydecimal;
        double soymaspreciso;
        char palabraCorta;
        entero = 515;
        elige = true;
        soyUnaPalabra = "Todos aqui somos unas personas dedicadas";
        soydecimal = 14.96f;
        soymaspreciso = 5145.146;
        palabraCorta = 'a';

        int creado2016 = 6546532, resultado;
        //Casting
        resultado = (int) (soydecimal * entero);


        //System.out.println(dias + entero + soymaspreciso + soyUnaPalabra + palabraCorta + soydecimal + palabraCorta + "Son algunas de las variables que se pueden presentar aqui" + elige);
        System.out.println(resultado);

    }
}
