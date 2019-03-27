package LP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clsMenu {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/**
 * Aca se decide si se da de alta, de baja o sales de la aplicacion
 * @throws IOException
 */

    public void MenuPrincipal() throws IOException {
        System.out.println("Elige una opción: \n" +
                "Dar de alta --> ALTA \n" +
                "Dar de baja --> BAJA \n" +
                "Leer datos --> LEER \n" +
                "Salir --> SALIR");

        String eleccion1 = br.readLine();
        eleccion1 = eleccion1.toUpperCase();
        switch (eleccion1) {
            case "ALTA":
                DarAlta();
            case "BAJA":
                DarBaja();
            case "LEER":
                LeerDatos();
            case "SALIR":
        }
    }
/**
 * Si decides dar de alta, te lleva a elegir entre papel, cartucho o impresora
 * @throws IOException
 */
    public void DarAlta() throws IOException {
        System.out.println("¿Qué quieres dar de alta? \n" +
                "Papel ---> PAPEL \n" +
                "Cartucho de tinta --> TINTA \n" +
                "Impresora --> IMPRESORA");

        String eleccionAlta = br.readLine();
        eleccionAlta = eleccionAlta.toUpperCase();
        switch (eleccionAlta){
            case "PAPEL":

            case "TINTA":

            case "IMPRESORA":
        }
    }
/**
 * Si decides dar de baja, te lleva a elegir entre papel, cartucho o impresora
 * @throws IOException
 */
    public void DarBaja() throws IOException {
        System.out.println("¿Qué quieres dar de baja? \n" +
                "Papel --> PAPEL \n" +
                "Cartucho de tinta --> TINTA\n" +
                "Impresora --> IMPRESORA");

        String eleccionBaja = br.readLine();
        eleccionBaja = eleccionBaja.toUpperCase();
        switch (eleccionBaja){
            case "PAPEL":

            case "TINTA":

            case "IMPRESORA":
        }
    }
    /**
     * Aca se puede leer los datos de cada aparatado (papel, cartucho o Impresora)
     * @throws IOException
     */
    public void LeerDatos() throws IOException {
        System.out.println("¿Qué quieres leer? \n" +
                "Papel --> PAPEL \n" +
                "Cartucho de tinta --> TINTA\n" +
                "Impresora --> IMPRESORA");

        String eleccionLeer = br.readLine();
        eleccionLeer = eleccionLeer.toUpperCase();
        switch (eleccionLeer) {
            case "PAPEL":

            case "TINTA":

            case "IMPRESORA":
        }
    }
}
