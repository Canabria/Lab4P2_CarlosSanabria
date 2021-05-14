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
public class Proyectos {
    private String nom,nom_e,decrip;
    private int candi_d;
    private String estado;
    ArrayList<Desarrolladores>d= new ArrayList();
    ArrayList<Directores>dic=new ArrayList();
    ArrayList<Consultores>c= new ArrayList();

    public Proyectos(String nom, String nom_e, String decrip, int candi_d, String estado,ArrayList<Desarrolladores>d,ArrayList<Directores>dic,ArrayList<Consultores>c) {
        this.nom = nom;
        this.nom_e = nom_e;
        this.decrip = decrip;
        this.candi_d = candi_d;
        this.estado = estado;
        this.d=d;
        this.dic=dic;
        this.c=c;
    }

    public Proyectos() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom_e() {
        return nom_e;
    }

    public void setNom_e(String nom_e) {
        this.nom_e = nom_e;
    }

    public String getDecrip() {
        return decrip;
    }

    public void setDecrip(String decrip) {
        this.decrip = decrip;
    }

    public int getCandi_d() {
        return candi_d;
    }

    public void setCandi_d(int candi_d) {
        this.candi_d = candi_d;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Desarrolladores> getD() {
        return d;
    }

    public void setD(ArrayList<Desarrolladores> d) {
        this.d = d;
    }

    public ArrayList<Directores> getDic() {
        return dic;
    }

    public void setDic(ArrayList<Directores> dic) {
        this.dic = dic;
    }

    public ArrayList<Consultores> getC() {
        return c;
    }

    public void setC(ArrayList<Consultores> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Proyectos:\n" + "Nombre: \n" + nom + "Nombre empresa: " + nom_e +"\n"+ "Descripcion: " + decrip +"\n"+ "Cantidad de años de duración: " + candi_d +"\n"+ "Estado actual: " + estado +"\n"+ "Desarrolladores: " + d +"\n"+ "Directores: " + dic +"\n"+ "Consultores: " + c +"\n";
    }
    
    
}
