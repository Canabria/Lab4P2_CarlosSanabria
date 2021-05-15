
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
                                    case 1: {
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
                                                                    while(nn<2){
                                                                        for (int i = 0; i < emp.size(); i++) {
                                                                             if(emp.get(i) instanceof Consultores){
                                                                                 System.out.println(i+")"+emp.get(i));
                                                                             }
                                                                        }
                                                                        System.out.println("Ingrese el indice de los consultores que estan listados con este Director: ");
                                                                        int m=sc.nextInt();
                                                                        cant_p = ((Consultores) emp.get(m)).getCant_p();
                                                                        cant_a = ((Consultores) emp.get(m)).getCant_a();
                                                                        tiempo_c = ((Consultores) emp.get(m)).getTiempo_c();
                                                                        campo_e = ((Consultores) emp.get(m)).getCampo_e();
                                                                        c.add(new Consultores(cant_p, cant_a, tiempo_c, campo_e, Nombre, ID, Username, Password, nacionalidad, a_contrrato));
                                                                        nn++;
                                                                    }
                                                                    nn=0;
                                                                    int cantidad_a,cantidad_p,años_e,horas_t;
                                                                    String lenguaje_p;
                                                                    while(nn<5){
                                                                        for (int i = 0; i < emp.size(); i++) {
                                                                             if(emp.get(i) instanceof Desarrolladores){
                                                                                 System.out.println(i+")"+emp.get(i));
                                                                             }
                                                                        }
                                                                        System.out.println("Ingrese el indice de los Desarolladores que estan listados con este Director: ");
                                                                        int m=sc.nextInt();
                                                                         cantidad_a = ((Desarrolladores) emp.get(m)).getCantidad_a();
                                                                        cantidad_p = ((Desarrolladores) emp.get(m)).getCantidad_p();
                                                                        años_e = ((Desarrolladores) emp.get(m)).getAños_e();
                                                                        horas_t = ((Desarrolladores) emp.get(m)).getHoras_t();
                                                                        lenguaje_p = ((Desarrolladores) emp.get(m)).getLenguaje_p();
                                                                        d.add(new Desarrolladores(cantidad_a, cantidad_p, años_e, horas_t, lenguaje_p, Nombre, ID, Username, Password, nacionalidad, a_contrrato));
                                                                        nn++;
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
                                                    String Nombre_pro, nombre_empresa, estado,descrip;
                                                    int cant_dura;
                                                    System.out.println("Ingrese el Nombre del Proyecto: ");
                                                    Nombre_pro = sc.next();
                                                    System.out.println("Ingrese el nombre de la Empresa: ");
                                                    nombre_empresa = sc.next();
                                                    System.out.println("Ingrese la descripcion de proyecto: ");
                                                    descrip=sc.next();
                                                    System.out.println("Ingrese la Duracion del Proyecto: ");
                                                    cant_dura = sc.nextInt();
                                                    System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");
                                                    estado = sc.next();
                                                    while (!estado.equalsIgnoreCase("Iniciado") && !estado.equalsIgnoreCase("Desarrollado") && !estado.equalsIgnoreCase("Terminado")) {
                                                        System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");;
                                                        estado = sc.next();
                                                    }
                                                    int n=0;
                                                    String Nombre, ID, nacionalidad, Username, Password;
                                                    int a_contrrato1;
                                                    ArrayList<Directores>dic=new ArrayList();
                                                    
                                                    ArrayList<Consultores>c= new ArrayList();
                                                    
                                                    ArrayList<Desarrolladores>d=new ArrayList();
                                                    int a_puesto,cant_proyectos,cant_desa;
                                                    while(n<2){
                                                        for (int i = 0; i < emp.size(); i++) {
                                                            if(emp.get(i) instanceof Directores){
                                                                System.out.println(i+")"+emp.get(i));
                                                            }
                                                        }
                                                        System.out.println("Ingrese el indice del director  que esta en el proyecto: ");
                                                        int m=sc.nextInt();
                                                         Nombre = emp.get(m).getNom();
                                                        ID = emp.get(m).getId();
                                                        Username = emp.get(m).getUser();
                                                        Password = emp.get(m).getPass();
                                                        nacionalidad = emp.get(m).getNacio();
                                                        a_contrrato1 = emp.get(m).getAno_c();
                                                        a_puesto = ((Directores) emp.get(m)).getAnos_d();
                                                        cant_desa = ((Directores) emp.get(m)).getCant_p();
                                                        cant_proyectos = ((Directores) emp.get(m)).getCant_a();
                                                        d = ((Directores) emp.get(m)).getD();
                                                        c = ((Directores) emp.get(m)).getC();
                                                        dic.add(new Directores(a_puesto, cant_desa, cant_proyectos, c, d, Nombre, ID, Username, Password, nacionalidad, a_contrrato1));
                                                        n++;
                                                    }
                                                    
                                                    pro.add(new Proyectos(Nombre_pro,nombre_empresa,descrip,cant_dura,estado,d,dic,c));
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
                                                System.out.println("---MENU---\n"
                                                        + "1. Modificar Empleado\n"
                                                        + "2. Modificar Proyecto\n"
                                                        + "3. Salir\n"
                                                        + "Ingrese su opcion: ");
                                                op1 = sc.nextInt();
                                                switch (op1) {
                                                    case 1: {
                                                        boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                if (emp.isEmpty()) {
                                                                    System.out.println("No hay Empleados para modificar");
                                                                } else {
                                                                    System.out.println("Ingrese posicion para modificar un Empleado");
                                                                    for (int i = 0; i < emp.size(); i++) { 
                                                                        System.out.println("En la posicion " + i + ") " + ", está: " + emp.get(i).getNom());
                                                                    }
                                                                    System.out.print("Ingrese poscion: ");
                                                                    int pos = sc.nextInt();
                                                                    int opc11 = 0;
                                                                    String Nombre, ID, nacionalidad, Username, Password;
                                                                    int a_contrrato;
                                                                    while (opc11 != 8) {
                                                                        System.out.println("1-Nombre\n"
                                                                                + "2-ID \n"
                                                                                + "3-Nacionalidad\n"
                                                                                + "4-Años Contratado\n"
                                                                                + "5-Modficar Consultor\n"
                                                                                + "6-Modifcar Director\n"
                                                                                + "7-Modificar Desarrollador\n"
                                                                                + "8-Salir");
                                                                        opc11 = sc.nextInt();
                                                                        switch (opc11) {
                                                                            case 1: {
                                                                                System.out.println("Ingrese el Nombre del Empleado: ");
                                                                                Nombre = sc.next();
                                                                                emp.get(pos).setNom(Nombre);
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                System.out.println("Ingrese el ID del Empleado: ");
                                                                                ID = sc.next();
                                                                                emp.get(pos).setId(ID);
                                                                                break;
                                                                            }
                                                                            case 3: {
                                                                                System.out.println("Ingrese la Nacionalidad: ");
                                                                                nacionalidad = sc.next();
                                                                                emp.get(pos).setNacio(nacionalidad);
                                                                                break;
                                                                            }
                                                                            case 4: {
                                                                                System.out.println("Años de Contrato: ");
                                                                                a_contrrato = sc.nextInt();
                                                                                emp.get(pos).setAno_c(a_contrrato);

                                                                                break;
                                                                            }
                                                                            case 5: {
                                                                                int cant_proyectos, cant_desar, dura_consult;
                                                                                String campo_Experiencia;
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Asignados: ");
                                                                                cant_proyectos = sc.nextInt();
                                                                                ((Consultores) emp.get(pos)).setCant_a(cant_proyectos);
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                                cant_desar = sc.nextInt();
                                                                                ((Consultores) emp.get(pos)).setCant_p(cant_desar);
                                                                                System.out.println("Ingrese la Duracion de la Consulta: ");
                                                                                dura_consult = sc.nextInt();
                                                                                ((Consultores) emp.get(pos)).setTiempo_c(dura_consult);
                                                                                System.out.println("Ingrese su Campo de Experiencia: ");
                                                                                campo_Experiencia = sc.next();
                                                                                ((Consultores) emp.get(pos)).setCampo_e(campo_Experiencia);

                                                                                break;
                                                                            }
                                                                            case 6: {
                                                                                int a_puesto, cant_proyectos, cant_desa;
                                                                                System.out.println("Ingrese los Años en el puesto: ");
                                                                                a_puesto = sc.nextInt();
                                                                                ((Directores) emp.get(pos)).setAnos_d(a_puesto);
                                                                                System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                                cant_proyectos = sc.nextInt();
                                                                                ((Directores) emp.get(pos)).setCant_a(cant_proyectos);
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                                cant_desa = sc.nextInt();
                                                                                ((Directores) emp.get(pos)).setCant_p(cant_desa);
                                                                                break;
                                                                            }
                                                                            case 7: {
                                                                                int a_exp, hora_trabajo, cant_pro, cant_des;
                                                                                String leng_fav;
                                                                                System.out.println("Ingrese sus Años de Experiencia: ");
                                                                                a_exp = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setAños_e(a_exp);
                                                                                System.out.println("Ingrese sus Horas de Trabajo: ");
                                                                                hora_trabajo = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setHoras_t(hora_trabajo);
                                                                                System.out.println("Ingrese la Cantidad de proyectos Asignados: ");
                                                                                cant_pro = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setCantidad_a(cant_pro);
                                                                                System.out.println("Ingrese la Cantidad de Proyectos Desarrollados: ");
                                                                                cant_des = sc.nextInt();
                                                                                ((Desarrolladores) emp.get(pos)).setCantidad_p(cant_des);
                                                                                System.out.println("Ingrese su Lenguaje de Programacion Favoritos: ");
                                                                                leng_fav = sc.next();
                                                                                ((Desarrolladores) emp.get(pos)).setLenguaje_p(leng_fav);
                                                                                break;
                                                                            }

                                                                            default:

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
                                                        boolean validar = true;
                                                        while (validar = true) {
                                                            try {
                                                                if (pro.isEmpty()) {
                                                                    System.out.println("No hay Proyectos para modificar");
                                                                } else {
                                                                    System.out.println("Ingrese posicion para modificar un Proyecto");
                                                                    for (int i = 0; i < pro.size(); i++) { 
                                                                        System.out.println("En la posicion " + i + ") " + ", está: " + pro.get(i).getNom());
                                                                    }
                                                                    System.out.print("Ingrese poscion: ");
                                                                    int pos2 = sc.nextInt();
                                                                    int opc11 = 0;
                                                                    String Nombre_pro, nombre_empresa,estado;
                                                                    int cant_dura;
                                                                    while (opc11 != 7) {
                                                                        System.out.println("1-Nombre del Proyecto\n"
                                                                                + "2-Nombre de la Empresa \n"
                                                                                + "3-Duracion del Proyecto\n"
                                                                                + "4-Estado\n"
                                                                                + "5. Descripcion\n"
                                                                                + "6. Salir");
                                                                        opc1 = sc.nextInt();
                                                                        switch (opc1) {
                                                                            case 1: {

                                                                                System.out.println("Ingrese el Nombre del Proyecto: ");
                                                                                Nombre_pro = sc.next();
                                                                                pro.get(pos2).setNom(Nombre_pro);
                                                                                break;
                                                                            }

                                                                            case 2: {
                                                                                System.out.println("Ingrese el nombre de la Empresa: ");
                                                                                nombre_empresa = sc.next();
                                                                                pro.get(pos2).setNom_e(nombre_empresa);
                                                                                break;
                                                                            }

                                                                            case 3: {
                                                                                System.out.println("Ingrese la Duracion del Proyecto: ");
                                                                                cant_dura = sc.nextInt();
                                                                                pro.get(pos2).setCandi_d(cant_dura);
                                                                                break;
                                                                            }

                                                                            case 4: {
                                                                                System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");
                                                                                estado = sc.next();
                                                                                pro.get(pos2).setEstado(estado);
                                                                                while (!estado.equalsIgnoreCase("Iniciado") && !estado.equalsIgnoreCase("Desarrollado") && !estado.equalsIgnoreCase("Terminado")) {
                                                                                    System.out.println("Ingrese el estado del Proyecto(Iniciado/Desarrollado/Terminado)");;
                                                                                    estado = sc.next();
                                                                                    pro.get(pos2).setEstado(estado);
                                                                                }
                                                                                break;
                                                                            }

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
                                                    default:
                                                }
                                            }

                                        break;
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

                                    case 5: {

                                        break;
                                    }

                                    default:

                                }
                            }
                    }else{
                        int t=0;
                        int mn=0;
                        for (int i = 0; i < emp.size(); i++) {
                            if(emp.get(i).getUser().equalsIgnoreCase(usa)&&emp.get(i).getPass().equalsIgnoreCase(contra)){
                                if(emp.get(i) instanceof Desarrolladores){
                                    t=1;
                                }else if(emp.get(i) instanceof Directores){
                                    t=2;
                                }else if(emp.get(i) instanceof Consultores){
                                    t=3;
                                }
                                mn=i;
                            }
                            switch(t){
                                case 1:
                                    int e=0;
                                    while(e!=3){
                                        System.out.println("***Menu***\n"
                                                + "1.Ver informacion perosonal\n"
                                                + "2.Eliminar cuenta\n"
                                                + "3.Ver proyectos asignados\n"
                                                + "Ingrese su opcion: ");
                                        e=sc.nextInt();
                                        switch(e){
                                            case 1:
                                                System.out.println(emp.get(mn));
                                             break;
                                            case 2:
                                            break;
                                            case 3:
                                            break;
                                        }
                                    }
                                break;
                                case 2:
                                break;
                                case 3:
                                break;
                            }
                        }
                        
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
            }
        }
    }
    
}
