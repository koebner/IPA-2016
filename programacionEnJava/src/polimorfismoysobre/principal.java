package polimorfismoysobre;

/**
 * Created by e-okcenter on 26/01/2016.
 */
public class principal {


    public static void main(String[] args) {

        sobrecarga objeto = new sobrecarga();

        objeto.mostrarC(5453);
        objeto.mostrarC();

        polimorfismo objeto1 = new polimorfismo();
        objeto1.mostrarC();
        poli2 objeto2 = new poli2();
        objeto2.mostrarC();

    }
}



/*

    sobrecarga objeto1 = new sobrecarga();
objeto1.mostrarC();
        sobrecarga objeto2 = new sobrecarga(542);
        objeto2.mostrarC();
        sobrecarga objeto3 = new sobrecarga(2151,614);
        objeto3.mostrarC();
        */