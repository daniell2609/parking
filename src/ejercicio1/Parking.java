/*
Clase parking
 */
package ejercicio1;

/**
 *
 * @author Daniel Pampliega
 */
public class Parking {

    String[] plazas;

    public Parking(String[] plazas) {
        this.plazas = plazas;
    }

    public Parking() {
        plazas = new String[100]; //numero de plazas que tiene el parking
    }

    public Parking(int numeroPlazas) { //no hace falta pero es para probar con menos elementos
        plazas = new String[numeroPlazas];
    }
    //cuando inciamos queremos que todas las plazas esten libres, no null.
    //para cambiar todas las plazas a la vez a libres en vez de una a una

    public void inicializarPlazas() {
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            plazas[nplaza] = "LIBRE"; //para poner todas las plazas libres.
        }
    }

    //para ver si hace bien la entrada y la salida hacemos el informe (visualizacion)
    public void estadoParking() {
        System.out.println("plaza  estado");
        for (int nplaza = 0; nplaza < plazas.length; nplaza++) {
            System.out.println(nplaza + " --> " + plazas[nplaza]);
        }

    }

    /**
     * busqueda Secuencial. encuentra el primer valor libre
     *
     * @return posicion donde se encuentra el primer valor igual a libre, -1 en
     * caso contrario.
     */
    public int busquedaSecuencial() {
        int nplaza = 0;
        boolean encontrado = false;

        while (nplaza < plazas.length && !encontrado) {

            if (plazas[nplaza].equalsIgnoreCase("LIBRE")) {
                encontrado = true;
            } else {
                nplaza++;
            }

        }

        if (nplaza == plazas.length) {
            nplaza = -1;
        }

        return nplaza;
    }

    public void entrada() {
        int nplaza = busquedaSecuencial();
        if (nplaza == -1) {
            System.out.println("Parking completo");
        } else {
            plazas[nplaza] = "OCUPADO";
            System.out.println("La plaza asignada es: " + nplaza);
        }

    }

}//class
