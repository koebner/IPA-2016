package Abstraccion;

/**
 * Created by e-okcenter on 27/01/2016.
 */
public class rectangulo {

        double area;

        public void calculaAreaRectangulo(int alto, int ancho) {
            area = ((ancho)*(alto));
            System.out.println("el area de este rectangulo es : " + area);
        }



}
