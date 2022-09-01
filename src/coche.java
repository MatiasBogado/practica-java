public class coche {

    int numeroPuertas = 0;

    coche(){

    }
    public void agregarPuerta(){
        numeroPuertas++;
        System.out.println("Se agrego una puerta");
    }
    public void mostrarNumeroPuertas(){
        System.out.println("Cantidad de puertases:"+numeroPuertas);
    }
}

