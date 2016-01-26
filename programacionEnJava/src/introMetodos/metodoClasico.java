package introMetodos;

/**
 * Created by e-okcenter on 26/01/2016.
 * sistemas de metodos
 */
public class metodoClasico {
    public static void main(String[] args) {
        int variable1, variable2;


        colecciondeMetodos gatillo = new colecciondeMetodos();

        gatillo.metodo();
        gatillo.metodo3(542, 545);
        variable1 = gatillo.metodo2();
        System.out.println(variable1);

    }


}
