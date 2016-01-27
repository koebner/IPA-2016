package ejemploDeContructur;

/**
 * Created by e-okcenter on 26/01/2016.
 */
public class iniciaContructor {

    private int ejemplo,inicializado1;
    private  String inicializado2;



    public iniciaContructor(int a, int b, String c){
        ejemplo = a;
        inicializado1 = b;
        inicializado2 = c;
    }

    public void conseguirDatosContructor(){

        System.out.println(ejemplo +" "+ inicializado1 + " "+ inicializado2);
    }




}
