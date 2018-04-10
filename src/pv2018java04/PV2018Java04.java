/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018java04;

import fecha.Fecha;
import letras.Inversion;
import letras.Repeticion;
import letras.Vocales;

/**
 *
 * @author Agustin
 */
public class PV2018Java04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        iniciarPrograma();// TODO code application logic here
    }
    public static void iniciarPrograma(){
        Fecha obtFecha=new Fecha();
        obtFecha.devolverLaEdadEnSemana();
         Repeticion obtRep=new Repeticion();
        obtRep.cargarCad();
        System.out.println("La cantidad de repeticiones es: "+obtRep.contarRep());
        Inversion inv=new Inversion();
        inv.cargarCad();
        inv.invertirCad();
        Vocales obtVocales=new Vocales();
        obtVocales.cargarCadena();
        System.out.println("La cantidad de vocales es: "+obtVocales.obtenerVocales());
       
    }
    
}
