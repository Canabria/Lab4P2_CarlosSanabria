/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlossanabria;

import java.util.ArrayList;

/**
 *
 * @author Carlos Sanabria
 */
public class Directores extends Empleados implements Sueldo{
    private int anos_d,cant_p,cant_a, ano_c;
    ArrayList<Consultores>c= new ArrayList();
    ArrayList<Desarrolladores> d=new ArrayList();
    private double sueldos=0;

    public Directores(int anos_d, int cant_p, int cant_a,ArrayList<Consultores>c,ArrayList<Desarrolladores>d, String nom, String id, String user, String pass, String nacio, int ano_c) {
        super(nom, id, user, pass, nacio, ano_c);
        this.anos_d = anos_d;
        this.cant_p = cant_p;
        this.cant_a = cant_a;
        this.c=c;
        this.d=d;
        this.ano_c=ano_c;
    }

    public Directores(int anos_d, int cant_p, int cant_a) {
        this.anos_d = anos_d;
        this.cant_p = cant_p;
        this.cant_a = cant_a;
    }

   
    public int getAnos_d() {
        return anos_d;
    }

    public void setAnos_d(int anos_d) {
        this.anos_d = anos_d;
    }

    public int getCant_p() {
        return cant_p;
    }

    public void setCant_p(int cant_p) {
        this.cant_p = cant_p;
    }

    public ArrayList<Desarrolladores> getD() {
        return d;
    }

    public void setD(ArrayList<Desarrolladores> d) {
        this.d = d;
    }

    public double getSueldos() {
        return sueldos;
    }

    public void setSueldos(double sueldos) {
        this.sueldos = sueldos;
    }

    public int getCant_a() {
        return cant_a;
    }

    public void setCant_a(int cant_a) {
        this.cant_a = cant_a;
    }

    public ArrayList<Consultores> getC() {
        return c;
    }

    public void setC(ArrayList<Consultores> c) {
        this.c = c;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Directores: \n" + "Anos durante su puesto: " + anos_d+"\n"+"Cantidad de proyectos asignados: "+cant_a+"\n"+ "Cantidad de proyectos realizados: " + cant_p+"\n"+ "Desarrolladores: " + d +"\n"+ "Sueldos: " + sueldos + "\n";
    }
    @Override
    public double sueldos(){
        return this.sueldos=((((this.cant_p*this.cant_a)*this.c.size())*this.d.size())*5.23)/((this.cant_a*this.ano_c)*2.28);
    }
    
}
