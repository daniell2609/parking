/*
Ejercicio parking arrays
 */
package ejercicio1;

/**
 *
 * @author Daniel Pampliega
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parking artesano;
        artesano = new Parking(5);//si pones un numero en los corchetes seran las plazas que se creen
        artesano.inicializarPlazas(); //inicializa todas las plazas a libre
        artesano.estadoParking(); // ver el estado del parking

    }//void main

}//class
