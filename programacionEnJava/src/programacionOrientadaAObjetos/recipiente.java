package programacionOrientadaAObjetos;

/**
 * Created by e-okcenter on 26/01/2016.
 */
public class recipiente {

    boolean statusDelVaso;
    //int entero ;
    String colorDeRecipiente = "azul", tamaño = "Chico";

            public void llenarRecipiente(){

                System.out.println("el recipiente se ha llenado");
                statusDelVaso = true;
            }

            public void vaciarRecipiente(){
                    System.out.println("el recipiente se ha vaciado");
                    statusDelVaso = false;
            }

            public void estadoDelRecipiente(){

              // System.out.println(palabra);
                if (statusDelVaso){
                    System.out.println("el recipiente esta lleno");
                }
                else
                {
                    System.out.println("el recipiente esta vacio");

                }
            }


}
