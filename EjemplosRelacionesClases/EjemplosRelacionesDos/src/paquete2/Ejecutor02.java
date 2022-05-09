/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        // Crear una persona del barrio del vallle de la ciudad de loja
        //crear una persona del barrio central de la ciudad de Cuenca
        //Crear un apersona del Bariio centenario de la ciudad de guayaquil
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
         Ciudad ciudad3 = new Ciudad("Guayaquil");
        
        Barrio barrio1 = new Barrio("El valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);
        
        Persona persona1 = new Persona("Josue Casares", "1100952909", barrio1);
        
        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s(%s)es: %s\n Y pertenece a la "
                + "ciudad: %s\n",persona1.obtenerNombre(),persona1.obtenerCedula(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        
        Persona persona2 = new Persona("Oscar Dominguez", "1100109909", barrio2);
         System.out.printf("El barrio de la persona %s(%s)es: %s\n Y pertenece a la "
                + "ciudad: %s\n",persona2.obtenerNombre(),persona2.obtenerCedula(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
         Persona persona3 = new Persona("Juan Salsa", "1104539909", barrio3);
        
         System.out.printf("El barrio de la persona %s(%s)es: %s\n Y pertenece a la "
                + "ciudad: %s\n",persona3.obtenerNombre(),persona3.obtenerCedula(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");
        
        

    }
}
