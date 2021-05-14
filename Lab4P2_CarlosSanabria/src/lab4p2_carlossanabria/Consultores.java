/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlossanabria;

/**
 *
 * @author Carlos Sanabria
 */
public class Consultores extends Empleados implements Sueldo{
    private int cant_p,cant_a,tiempo_c,ano_c;
    private String campo_e;
    private double sueldo=0;

    public Consultores(int cant_p, int cant_a, int tiempo_c, String campo_e, String nom, String id, String user, String pass, String nacio, int ano_c) {
        super(nom, id, user, pass, nacio, ano_c);
        this.cant_p = cant_p;
        this.cant_a = cant_a;
        this.tiempo_c = tiempo_c;
        this.campo_e = campo_e;
        this.ano_c=ano_c;
    }

    public Consultores(int cant_p, int cant_a, int tiempo_c, String campo_e) {
        this.cant_p = cant_p;
        this.cant_a = cant_a;
        this.tiempo_c = tiempo_c;
        this.campo_e = campo_e;
    }
    
   
    public int getCant_p() {
        return cant_p;
    }

    public void setCant_p(int cant_p) {
        this.cant_p = cant_p;
    }

    public int getTiempo_c() {
        return tiempo_c;
    }

    public void setTiempo_c(int tiempo_c) {
        this.tiempo_c = tiempo_c;
    }

    public String getCampo_e() {
        return campo_e;
    }

    public void setCampo_e(String campo_e) {
        this.campo_e = campo_e;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCant_a() {
        return cant_a;
    }

    public void setCant_a(int cant_a) {
        this.cant_a = cant_a;
    }

    @Override
    public String toString() {
        return super.toString()+"Consultores: \n" + "Cantidad de proyectos realizados: " + cant_p +"\n"+"Cantidad de proyectos asignados: "+cant_a+"\n"+ "Tiempo de duración de la consultoria: " + tiempo_c +"\n "+"campo de experencia: " + campo_e +"\n"+ "Sueldo: " + sueldo+"\n";
    }
    @Override
    public double sueldos(){
        return this.sueldo=((cant_p*13280)*4.13)/(this.cant_a+ano_c);
    }
    
    
}
