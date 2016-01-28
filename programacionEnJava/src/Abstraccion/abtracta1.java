package Abstraccion;

/**
 * Created by e-okcenter on 27/01/2016.
 */
public abstract class  abtracta1 extends rectangulo{

    public static  double pi = 3.14159265358979323846264338327950288419716939937510;
    double area;

    public void calculaAreaCirculo(int radio) {
        area = pi * ((radio)*(radio));
        System.out.println("el area de este circulo es : " + area);
    }
    abstract public void metodoAbstracto();
}
