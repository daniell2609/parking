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
        byte opcion;
        artesano.inicializarPlazas(); //inicializa todas las plazas a libre
        menu();
        opcion = artesano.pedirNumero();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    artesano.entrada();
                    break;
                case 2:
                    artesano.salida();
                    break;

                case 3:
                    artesano.estadoParking();
                default:

            }
            opcion = artesano.pedirNumero();
        }

    }//void main

    public static void menu() {
        System.out.println("1= ENTRADA");
        System.out.println("2= SALIDA");
        System.out.println("3= ESTADO DEL PARKING");
        System.out.println("4= FIN");
        System.out.println("OPCION: ");

    }//menu

}//class
