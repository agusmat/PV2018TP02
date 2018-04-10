/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agustin
 */
public class Fecha {
    private String fecNac;
    public Fecha() {
    }
    public Date brindarFecha(){
        Date hoy = new Date();
        return hoy;
    }
    public String ingresarFec(){
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Ingrese Fecha de Nac");
        setFecNac(ingreso.nextLine());
        return getFecNac();
    }
    public Date pasarStringADate(){
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date fechaDevuelta=formato.parse(getFecNac());
            return fechaDevuelta;
        }
        catch(ParseException e){
                System.out.println("No se puede Formatear");
                return null;
                }
    }
    public void devolverLaEdadEnSemana(){
        double b;
        b=(pasarStringADate().getTime())-(brindarFecha().getTime());
        System.out.println(b);
    }   

    /**
     * @return the fecNac
     */
    public String getFecNac() {
        return fecNac;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }
}

            
