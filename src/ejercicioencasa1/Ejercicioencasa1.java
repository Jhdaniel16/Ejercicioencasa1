/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioencasa1;

/**
 *
 * @author Jhdan
 */
public class Ejercicioencasa1 {

    public static void main(String[] args) {
        int C;
        C = 1997;
       System.out.println(C + (C >=0 ? "es positivo" : "es negativo"));
       System.out.println(C + (C%2==0 ? "es par" : "es impar"));
       System.out.println(C + (C%5==0 ? "es multiplo de 5" : "no es multiplo de 5"));
       System.out.println(C + (C%10==0 ? "es multiplo de 10" : "no es multiplo de 10"));
       System.out.println(C + (C>100 ? "es mayor que 100" : "es menor que 100"));
    }
    //hola
}
