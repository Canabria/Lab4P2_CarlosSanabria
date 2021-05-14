/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_carlossanabria;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
/**
 *
 * @author Carlos Sanabria
 */
public class Lab4P2_CarlosSanabria {
    public static Scanner sc= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op=0;
        ArrayList<Empleados> emp= new ArrayList();
        ArrayList<Proyectos> pro=new ArrayList();
        while(op!=2){
            System.out.println("***MENU***\n"
                    + "1.Ingreser a la base de datos \n"
                    + "2.Salir\n"
                    + "Ingrese su opcion:");
            op=sc.nextInt();
            if(op==1){
                int opc1=0;
                while(opc1!=2){
                System.out.println("***SUBMENU***\n"
                        + "1.Ingresar al sistema\n"
                        + "2.Salir\n"
                        + "Ingrese su opcion: ");
                opc1=sc.nextInt();
                if(opc1==1){
                    System.out.println("Ingrese su username: ");
                    String usa=sc.next();
                    System.out.println("Ingrese su contraseña: ");
                    String contra=sc.next();
                    if(usa.equalsIgnoreCase("Admin")&&contra.equalsIgnoreCase("1234")){
                        int opc2 = 0;
                            while (opc2 != 6) {
                                System.out.println("***Menu***\n"
                                        + "1. Agregar\n"
                                        + "2. Modificar\n"
                                        + "3. Listar\n"
                                        + "4. Eliminar"
                                        + "5. Simulacion\n"
                                        + "6. Salir"
                                        + "Ingrese su opcion: ");
                                opc2 = sc.nextInt();
                                switch (opc2) {
                                    case 1: {//AGREGAR
                                        int op1 = 0;
                                        while (op1 != 3) {
                                            System.out.println("***Menu***\n"
                                                    + "1. Crear Empleado\n"
                                                    + "2. Crear Proyectos\n"
                                                    + "3. Salir\n"
                                                    + "Ingrese su opcion: ");
                                            op1 = sc.nextInt();
                                            switch (op1) {
                                                case 1: {
                                                    boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                String Nombre, ID, nacionalidad, Username, Password;
                                                                int a_contrrato;
                                                                System.out.println("Ingrese el Nombre del Empleado: ");
                                                                Nombre = sc.next();
                                                                System.out.println("Ingrese el ID del Empleado: ");
                                                                ID = sc.next();
                                                                System.out.println("Ingrese la Nacionalidad: ");
                                                                nacionalidad = sc.next();
                                                                System.out.println("Años de Contrato: ");
                                                                a_contrrato = sc.nextInt();
                                                                System.out.println("Ingrese su Usuario: ");
                                                                Username = sc.next();
                                                                System.out.println("Ingrese su Password: ");
                                                                Password = sc.next();
                                                                while (Username.equalsIgnoreCase("Admin") && Password.equalsIgnoreCase("1234")) {
                                                                    System.out.println("No puede Ser Admin :( ");
                                                                    System.out.println("Ingrese su Usuario: ");
                                                                    Username = sc.next();
                                                                    System.out.println("Ingrese su Password: ");
                                                                    Password = sc.next();
                                                                }
                                                                System.out.println("Que Tipo de Empleado es?[Desarrolladores/Directores/Consultores]: ");
                                                                String type = sc.next();
                                                                while (!type.equalsIgnoreCase("Desarrollador") && !type.equalsIgnoreCase("Director") && !type.equalsIgnoreCase("Consultor")) {
                                                                    System.out.println("Por favor ingrese una de las cuatro Articulos:(Tirador/Pateador): ");
                                                                    type = sc.next();
                                                                }
                                                                if(type.equalsIgnoreCase("Desarrollador")){
                                                                    int a_exp, hora_trabajo, cant_pro,cant_des;
                                                                    String leng_fav;
                                                                    System.out.println("Ingrese sus Años de Experiencia: ");
                                                                    a_exp = sc.nextInt();
                                                                    System.out.println("Ingrese sus Horas de Trabajo: ");
                                                                    hora_trabajo = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                    cant_pro = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                    cant_des = sc.nextInt();
                                                                    System.out.println("Ingrese su Lenguaje de Programacion Favoritos: ");
                                                                    leng_fav = sc.next();
                                                                    emp.add(new Desarrolladores(cant_pro,cant_des,a_exp,hora_trabajo,leng_fav,Nombre,ID,Username,Password,nacionalidad,a_contrrato ));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if(((Desarrolladores)emp.get(i)).getSueldo()==0){
                                                                            double s=((Desarrolladores)emp.get(i)).sueldos();
                                                                            ((Desarrolladores)emp.get(i)).setSueldo(s);
                                                                            emp.get(i).setSueldo(s);
                                                                        }
                                                                    }  
                                                                }else if(type.equalsIgnoreCase("Director")){
                                                                    int cant_p,cant_a,tiempo_c;
                                                                    String campo_e;
                                                                    ArrayList <Desarrolladores> d = new ArrayList();
                                                                    ArrayList <Consultores> c = new ArrayList();
                                                                    int a_puesto,cant_proyectos,cant_desa;
                                                                    System.out.println("Ingrese los Años en el puesto: ");
                                                                    a_puesto = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                    cant_proyectos = sc.nextInt();
                                                                    System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                    cant_desa = sc.nextInt();
                                                                    int nn=0;
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if(emp.get(i) instanceof Consultores&&nn<2){
                                                                           cant_p=((Consultores)emp.get(i)).getCant_p();
                                                                           cant_a=((Consultores)emp.get(i)).getCant_a();
                                                                           tiempo_c=((Consultores)emp.get(i)).getTiempo_c();
                                                                           campo_e=((Consultores)emp.get(i)).getCampo_e();
                                                                            c.add(new Consultores(cant_p,cant_a,tiempo_c,campo_e,Nombre,ID,Username,Password,nacionalidad,a_contrrato));
                                                                            nn++;
                                                                        }
                                                                    }
                                                                    nn=0;
                                                                    int cantidad_a,cantidad_p,años_e,horas_t;
                                                                    String lenguaje_p;
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if(emp.get(i) instanceof Desarrolladores&&nn<5){
                                                                           cantidad_a=((Desarrolladores)emp.get(i)).getCantidad_a();
                                                                           cantidad_p=((Desarrolladores)emp.get(i)).getCantidad_p();
                                                                           años_e=((Desarrolladores)emp.get(i)).getAños_e();
                                                                           horas_t=((Desarrolladores)emp.get(i)).getHoras_t();
                                                                           lenguaje_p=((Desarrolladores)emp.get(i)).getLenguaje_p();
                                                                            d.add(new Desarrolladores(cantidad_a,cantidad_p,años_e,horas_t,lenguaje_p,Nombre,ID,Username,Password,nacionalidad,a_contrrato));
                                                                            nn++;
                                                                        }
                                                                    }
                                                                    emp.add(new Directores(a_puesto,cant_desa,cant_proyectos,c,d,Nombre,ID,Username,Password,nacionalidad,a_contrrato));
                                                                     for (int i = 0; i < emp.size(); i++) {
                                                                        if(((Directores)emp.get(i)).getSueldo()==0){
                                                                            double s=((Directores)emp.get(i)).sueldos();
                                                                            ((Directores)emp.get(i)).setSueldo(s);
                                                                            emp.get(i).setSueldo(s);
                                                                        }
                                                                    }
                                                                    
                                                                }else if(type.equalsIgnoreCase("Consultor")){
                                                                    int cant_p,cant_a,tiempo_c;
                                                                    String campo_e;
                                                                    System.out.println("Ingrese La cantidad de proyectos ya realisados: ");
                                                                    cant_p=sc.nextInt();
                                                                    System.out.println("Ingrese La cantidad de proyectos asignados: ");
                                                                    cant_a=sc.nextInt();
                                                                    System.out.println("Ingrese el tiempo de su consultoria: ");
                                                                    tiempo_c=sc.nextInt();
                                                                    System.out.println("Campo de experencia: ");
                                                                    campo_e=sc.next();
                                                                    emp.add(new Consultores(cant_p,cant_a,tiempo_c,campo_e,Nombre,ID,Username,Password,nacionalidad,a_contrrato));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if(((Consultores)emp.get(i)).getSueldo()==0){
                                                                            double s=((Consultores)emp.get(i)).sueldos();
                                                                            ((Consultores)emp.get(i)).setSueldo(s);
                                                                            emp.get(i).setSueldo(s);
                                                                        }
                                                                    }
                                                                }
                                                                else if(type.equalsIgnoreCase("Empleado")){
                                                                    emp.add(new Empleados(Nombre,ID,Username,Password,nacionalidad,a_contrrato));
                                                                    for (int i = 0; i < emp.size(); i++) {
                                                                        if(emp.get(i).getSueldo()==0){
                                                                            double s=emp.get(i).sueldos();
                                                                            emp.get(i).setSueldo(s);
                                                                        }
                                                                    }
                                                                }
                                                              
                                                                validar = false;

                                                            } catch (InputMismatchException e) {
                                                                System.out.println("Error!!!");
                                                            }
                                                        }
                                                    break;
                                                }
                                                case 2: {

                                                    break;
                                                }
                                                default:
                                            }
                                        }
                                        break;
                                    }
                                    case 2: {
                                        int op1 = 0;
                                        while (op1 != 3) {
                                            System.out.println("***MENU***\n"
                                                    + "1. Modificar Empleado\n"
                                                    + "2. Modificar Equipo\n"
                                                    + "3. Salir\n"
                                                    + "Ingrese su opcion: ");
                                            op1 = sc.nextInt();
                                            switch (op1) {
                                                case 1: {

                                                    
                                                    break;
                                                }
                                                case 2: {

                                                    break;
                                                }
                                                default:
                                            }

                                        break;
                                    }
                                    }
                                    case 3: {
                                        int op1 = 0;
                                        while (op1 != 3) {
                                            System.out.println("***MENU***\n"
                                                    + "1. Listar Empleados\n"
                                                    + "2. Listar Proyectos\n"
                                                    + "3. Salir\n"
                                                    + "Ingrese su opcion: ");
                                            op1 = sc.nextInt();
                                            switch (op1) {
                                                case 1: {
                                                    if (emp.isEmpty()) {
                                                            System.out.println("No hay Empleados agregados");
                                                        } else {
                                                            System.out.println("\nEMPLEADOS");
                                                            for (Object c : emp) {
                                                                System.out.println(emp.indexOf(c) + ")" + c + "\n");
                                                            }
                                                        }
                                                    break;
                                                }

                                                case 2: { 
                                                    if (pro.isEmpty()) {
                                                            System.out.println("No hay Proyectos agregados");
                                                        } else {
                                                            System.out.println("\nPROYECTOS");
                                                            for (Object c : pro) {
                                                                System.out.println(pro.indexOf(c) + ")" + c + "\n");
                                                            }
                                                        }
                                                    break;
                                                }
                                                default:
                                            }
                                        }

                                        break;
                                    }
                                    case 4: {
                                        int op1 = 0;
                                        while (op1 != 3) {
                                            System.out.println("***MENU***\n"
                                                    + "1. Eliminar Empleado\n"
                                                    + "2. Eliminar proyecto\n"
                                                    + "3. Salir\n"
                                                    + "Ingrese su opcion: ");
                                            op1 = sc.nextInt();
                                            switch (op1) {
                                                case 1: {
                                                    if (emp.isEmpty()) {
                                                            System.out.println("No hay Empleados agregados");
                                                        } else {
                                                            System.out.println("Ingrese la posicion del Empleado a eliminar ");
                                                            for (int i = 0; i < emp.size(); i++) {
                                                                System.out.println("En la posicion " + i + ") " + ", está: " + emp.get(i).getNom());
                                                            }
                                                            System.out.print("Ingrese posicion: ");
                                                            int pos = sc.nextInt();
                                                            emp.remove(pos);
                                                            System.out.println("Se ha eliminado el Empleado satisfactoriamente!!!");
                                                        }
                                                    break;
                                                }
                                                case 2: {
                                                     if (pro.isEmpty()) {
                                                            System.out.println("No hay Proyectos agregados");
                                                        } else {
                                                            System.out.println("Ingrese la posicion del Proyecto a eliminar ");
                                                            for (int i = 0; i < pro.size(); i++) {
                                                                System.out.println("En la posicion " + i + ") " + ", está: " + pro.get(i).getNom());
                                                            }
                                                            System.out.print("Ingrese posicion: ");
                                                            int pos = sc.nextInt();
                                                            pro.remove(pos);
                                                            System.out.println("Se ha eliminado el Proyecto satisfactoriamente!!!");
                                                        }
                                                    break;
                                                }
                                                default:

                                            }
                                        }

                                        break;
                                    }

                                    case 5: {//Simulacion

                                        break;
                                    }//fin del case 5

                                    default:

                                }//fin del switch principal
                            }//fin del while principal
                    }else{
                        
                    }
                }else if(opc1==2){
                    System.out.println("Salinedo del sistema");
                }else{
                    System.out.println("La opcion que ingreso no existe");
                }
                }
            }else if(op==2){
                System.out.println("Saliendo del sistema");
            }else{
                System.out.println("La opcion que ingreso no existe");
            }//fin del else
        }//fin del while
    }//fin del main
    
}//fin de la clase
