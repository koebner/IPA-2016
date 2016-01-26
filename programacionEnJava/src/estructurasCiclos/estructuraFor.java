package estructurasCiclos;

/**
 * Created by e-okcenter on 26/01/2016.
 */
public class estructuraFor {
    //validacion de ciclo For

    public static void main(String[] args){

        int incrementaValor = 10,incrementaValor2 = 30;
        String valor = "Avance";


         for (int i = 1;i<=incrementaValor;i++){

             System.out.println("incrementamos la variable String con el valor " + valor+" "+ i);

             for (int j = 21;j<=incrementaValor2;j++){

                 System.out.println("incrementamos la variable String con el valor " + valor+" "+ j);
             }



         }



    }

}
