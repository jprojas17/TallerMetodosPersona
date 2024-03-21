/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodosPersona;

import java.util.Random;

/**
 *
 * @author jproj
 */
public class Persona {
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;
    
    // Constante para sexo por defecto
    private static final char SEXO_POR_DEFECTO = 'H';
    
    // Constantes para calcular IMC
    private static final int PESO_IDEAL_BAJO = -1;
    private static final int PESO_IDEAL_NORMAL = 0;
    private static final int SOBREPESO = 1;
    
    // Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.cedula = generarCedula();
        this.sexo = SEXO_POR_DEFECTO;
        this.peso = 0;
        this.altura = 0;
    }
    
    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = generarCedula();
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }
    
    // Constructor con todos los atributos como parámetro
    public Persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    // Método para calcular el IMC
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PESO_IDEAL_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL_NORMAL;
        } else {
            return SOBREPESO;
        }
    }
    
    // Método para comprobar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    // Método para comprobar el sexo
    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }
    
    // Método para generar la cédula aleatoriamente
    private String generarCedula() {
        Random rnd = new Random();
        StringBuilder cedulaGenerada = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            cedulaGenerada.append(rnd.nextInt(10));
        }
        return cedulaGenerada.toString();
    }
    
    // Método toString para mostrar toda la información del objeto
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Cédula: " + cedula + "\n" +
               "Sexo: " + sexo + "\n" +
               "Peso: " + peso + "\n" +
               "Altura: " + altura + "\n" +
               "IMC: " + calcularIMC() + "\n" +
               "¿Es mayor de edad?: " + esMayorDeEdad();
    }
    
    // Métodos get y set de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     
}
