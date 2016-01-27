package InterfaceIPA;

/**
 * Created by e-okcenter on 27/01/2016.
 */
public class heredaInterface implements interfaceEjemplo2,interfaceEjemplo{


    @Override
    public void ejemplo3() {
        System.out.println("Hola mama soy un metodo de interface");
    }

    @Override
    public void ejemplo4() {

    }

    @Override
    public void metodo1() {

    }

    @Override
    public void metodo2(int c) {
        int a = c;
        System.out.println(a);
    }

    @Override
    public void metodo3(boolean pivote) {
        System.out.println(pivote);
    }
}
