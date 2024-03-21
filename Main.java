/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package MetodosPersona;

/**
 *
 * @author jproj
 */
public class Main {

    public static void main(String[] args) {
       Persona persona1 = new Persona();
        System.out.println("Persona 1:\n" + persona1);
        
        Persona persona2 = new Persona("Juan", 25, 'H');
        System.out.println("\nPersona 2:\n" + persona2);
        
        Persona persona3 = new Persona("María", 30, "1234567890", 'M', 65, 1.70);
        System.out.println("\nPersona 3:\n" + persona3);
    }
}
