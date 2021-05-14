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
public class Desarrolladores extends Empleados implements Sueldo{
    private int cantidad_a,cantidad_p,años_e,horas_t,ano_c;
    private String lenguaje_p;
    private double sueldo=0;

    public Desarrolladores(int cantidad_a, int cantidad_p, int años_e, int horas_t, String lenguaje_p, String nom, String id, String user, String pass, String nacio, int ano_c) {
        super(nom, id, user, pass, nacio, ano_c);
        this.cantidad_a = cantidad_a;
        this.cantidad_p = cantidad_p;
        this.años_e = años_e;
        this.horas_t = horas_t;
        this.lenguaje_p = lenguaje_p;
        this.ano_c=ano_c;
    }

    public Desarrolladores(int cantidad_a, int cantidad_p, int años_e, int horas_t, String lenguaje_p) {
        this.cantidad_a = cantidad_a;
        this.cantidad_p = cantidad_p;
        this.años_e = años_e;
        this.horas_t = horas_t;
        this.lenguaje_p = lenguaje_p;
    }

   

    public int getCantidad_p() {
        return cantidad_p;
    }

    public void setCantidad_p(int cantidad_p) {
        this.cantidad_p = cantidad_p;
    }

    public int getAños_e() {
        return años_e;
    }

    public void setAños_e(int años_e) {
        this.años_e = años_e;
    }

    public int getHoras_t() {
        return horas_t;
    }

    public void setHoras_t(int horas_t) {
        this.horas_t = horas_t;
    }

    public String getLenguaje_p() {
        return lenguaje_p;
    }

    public void setLenguaje_p(String lenguaje_p) {
        this.lenguaje_p = lenguaje_p;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getCantidad_a() {
        return cantidad_a;
    }

    public void setCantidad_a(int cantidad_a) {
        this.cantidad_a = cantidad_a;
    }

    public int getAno_c() {
        return ano_c;
    }

    public void setAno_c(int ano_c) {
        this.ano_c = ano_c;
    }

    @Override
    public String toString() {
        return super.toString()+"Desarrolladores:\n" +"Canitdad de proyectos: "+cantidad_a+"\n"+ "cantidad de proyectos realisado: " + cantidad_p +"\n"+ "Anos de experiencia: " + años_e +"\n"+ "Horas de trabajo: " + horas_t +"\n"+ "Lenguaje de programcion preferido: " + lenguaje_p +"\n"+ "Sueldo: " + sueldo +"\n";
    }
    @Override
    public double sueldos(){
        return this.sueldo=(((this.cantidad_p*115000)*2)/this.cantidad_a+this.ano_c);
    }
    
}
