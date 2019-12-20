/*
Clase parking
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    

    public byte pedirNumero() {
                BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        boolean correcto;
        byte numero = 0;
        correcto = false;
        while (!correcto) {
            try {
                
                numero = Byte.parseByte(teclado.readLine());
                if (numero > 0 && numero < 4 || numero == 4) {
                    correcto = true;
                } else {
                    System.out.println("No cumple las condiciones. Debe estar comprendido entre " + 1 + " y " + 3);
                }//else
            }//try
            catch (NumberFormatException ex) {
                System.out.println("No es un numero");
            } catch (IOException ex) {
            }
        }//While
        return  (byte) numero;
    }
    
    public void salida(){
        int nplaza;
        nplaza=pedirNumero();
        if (plazas[nplaza].equalsIgnoreCase("ocupado")){
            System.out.println("Plaza liberada");
            plazas[nplaza]="libre";
        } else {
            System.out.println("Esa plaza ya estaba libre");
        }
    }
    

}//class
