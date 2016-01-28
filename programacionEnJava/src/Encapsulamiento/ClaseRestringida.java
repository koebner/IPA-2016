package Encapsulamiento;

/**
 * Created by e-okcenter on 27/01/2016.
 */
public class ClaseRestringida {
    private int numeroAleatorio = 51545;
    private  String accesdenied= "soy una variable cadena muy restringida";
    protected  String accesoParcial = "Soy un acceso parcial Protected";

    private void accesoAMetodoPrivado(){
        System.out.println(numeroAleatorio);
    }
    public void accesoAMetodoPublico(int numeroAleatorio){
        this.numeroAleatorio = numeroAleatorio;
        System.out.println(this.numeroAleatorio);

    }
    protected void accesoAMetodoprotegido(int numeroAleatorio){
        this.numeroAleatorio = numeroAleatorio;
        System.out.println(this.numeroAleatorio);

    }
     void accesoAMetodoDefecto(String accesdenied){
         this.accesdenied = accesdenied;
         System.out.println(this.accesdenied);

    }
}
