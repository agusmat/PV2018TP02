/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class Repeticion {
    String cadena;
    String a;
    
    public Repeticion() {
    }
    
    public void cargarCad(){
        Vocales ingreso=new Vocales();
        cadena=ingreso.cargarCadena();
        Scanner ingresar=new Scanner(System.in);
        System.out.println("Ingrese Char");
        a=ingresar.nextLine();
    }
    
    public int contarRep(){
        char b=a.charAt(0);
        int rep=0;
        int i=(cadena.length()-1);
        String cadmay=cadena.toUpperCase();
        while (i>=0){
            if (cadena.charAt(i)==b||cadmay.charAt(i)==b){
                rep=rep+1;
            }
        i=i-1;
        }
        return rep;
    }
}
