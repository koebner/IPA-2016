package Herencia;

/**
 * Created by e-okcenter on 27/01/2016.
 */
public class ClasePadre {
    int resultado, operador1, operador2;

    public void metodoPadre(int x){
        operador1 = x;
        operador2 = 545;
        resultado = operador1 * operador2;
    }
    public void metodoPadre2(){
        System.out.println("Este es el resultado de mi operacion en la clase padre " +resultado);
    }
}
