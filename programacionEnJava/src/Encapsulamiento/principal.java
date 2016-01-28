package Encapsulamiento;

/**
 * Created by e-okcenter on 27/01/2016.
 */
public class principal {
    public static void main(String[] args){
        ClaseRestringida objeto1 = new ClaseRestringida();
        ClasedeAcceso objeto2 = new ClasedeAcceso();
        objeto2.defineCadena1("Hola soy una cadena que se agregara a una variable privada");
        System.out.println(objeto2.consigueCadena1());
    }
}
