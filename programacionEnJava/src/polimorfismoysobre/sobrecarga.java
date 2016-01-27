package polimorfismoysobre;

/**
 * Created by e-okcenter on 26/01/2016.
 */
public class sobrecarga {

    private int inicia1,inicia2,inicia3, resultado;


    public sobrecarga(int param1){
        inicia1 = 66;
        resultado = inicia1 * param1;

    }
    public sobrecarga(){
        inicia1 = 65263;
        resultado = inicia1 * 8536;
    }
    public sobrecarga(int param1 , int param2){

        inicia1 = 65263;
        resultado = inicia1 * param1*param2;
    }

    public void mostrarC(){

        System.out.println(resultado);
    }
    public void mostrarC(int entero){

        System.out.println(resultado + " soy un metodo sobrecargado");
    }


}
