/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author 901540G1
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nicolas David Hernandez");
        Arana objeto = new Arana();
        objeto.setNombre("Arañita");
        System.out.println("Nombre : "+objeto.getNombre());
        
        System.out.println("Anyi Johana Valverde");
        Gato objeto1 = new Gato();
        objeto1.setColor("Gris");
        System.out.println(objeto1.getColor());
    }
    
}
