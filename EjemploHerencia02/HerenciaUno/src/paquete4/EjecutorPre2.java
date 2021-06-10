/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author nixon
 */
public class EjecutorPre2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "Nixon";
        String apellido = "Vuele";
        String identificacion = "123456789";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(50.5);
        estPresencial.establecerNumeroCreditos(3);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}