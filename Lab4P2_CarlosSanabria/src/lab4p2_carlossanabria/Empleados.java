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
public class Empleados implements Sueldo{
    private String nom, id,user,pass,nacio;
    private int ano_c;
    private double sueldo=0;

    public Empleados(String nom, String id, String user, String pass, String nacio, int ano_c) {
        this.nom = nom;
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.nacio = nacio;
        this.ano_c = ano_c;
    }

   

    public Empleados() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getAno_c() {
        return ano_c;
    }

    public void setAno_c(int ano_c) {
        this.ano_c = ano_c;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNacio() {
        return nacio;
    }

    public void setNacio(String nacio) {
        this.nacio = nacio;
    }
    

    @Override
    public String toString() {
        return "Empleados: " + "Nombre: " + nom +"\n"+ "ID: " + id +"\n"+ "Username: " + user +"\n"+ "Password: " + pass +"\n"+"Nacionalidad: "+nacio+"\n"+ "Año del Contrato: " + ano_c +"\n"+ "Sueldo: " + sueldo +"\n";
    }

    @Override
    public double sueldos() {
        return this.sueldo=((12000*8)/2)*this.ano_c;
    }
    
    
}
