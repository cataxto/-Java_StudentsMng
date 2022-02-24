
package estudiantesenpoo;
import java.util.Scanner;

/**
 *
 * @author catax
 */
public class EstudiantesEnPOO 
{  
    public static void main(String[] args) //este es el metodo ppal
    {//cuando se ejecuta un  proyecto, comienza desde llave abierta del main
        
        /*
        ArregloEstudiantes vectorDeEstudiantes = new ArregloEstudiantes(3);
        vectorDeEstudiantes.ingresarEstudiante("Cata", 'f', 4.8f, 5.0f, 5.0f, .5f);
        System.out.println(vectorDeEstudiantes.getNotaDef());
        */
        
        int cantPosAreservar;
        String aNom;
        char aSexo;
        float p1,p2,p3,t;
        Estudiante unEstudiante;
        
        Scanner lector= new Scanner(System.in);
        System.out.print("Ingrese la cantidad de posiciones a reservar: ");
        cantPosAreservar=lector.nextInt();
        ArregloEstudiantes vectorDeEstudiante = new ArregloEstudiantes(cantPosAreservar);
        
        //Ingresar varios estudiantes por medio de un while
        lector.nextLine(); //limpiar buffer y poder ver enl Nombre
        System.out.println("Ingrese datos de estudiante: (/* en nombre para terminar)");
        
        //Crear arrego de extudiantes
        System.out.print("Nombre:                 ");
        aNom=lector.nextLine();
        while(!aNom.equals("/*")) //En Java no seria -> aNom != "/*"
        {
            System.out.print("Sexo:                   ");
            aSexo=lector.next().charAt(0);
            System.out.print("Ingrese Nota Parcial 1: ");
            p1=lector.nextFloat();
            System.out.print("Ingrese Nota Parcial 2: ");
            p2=lector.nextFloat();
            System.out.print("Ingrese Nota Trabajo:   ");
            t=lector.nextFloat();
            System.out.print("Ingrese Nota Parcial 3: ");
            p3=lector.nextFloat();
            vectorDeEstudiante.ingresarEstudiante(aNom, aSexo, p1, p2, p3, t);
            lector.nextLine(); //Limpio buffer
            System.out.print("\nNombre:                 ");
            aNom=lector.nextLine();
        }
        System.out.println();
        
        //Montrar un listado
        unEstudiante = vectorDeEstudiante.regresarObjetoEstudiante(); //inicializa un estudiante
        while (unEstudiante != null) 
        {
            System.out.println(unEstudiante.getNombre()+" "+unEstudiante.calcularDefinitiva()+
                               " "+unEstudiante.estadoEstudiante());
            unEstudiante=vectorDeEstudiante.regresarObjetoEstudiante();
        }
        System.out.println();
        
        //Ejercicio de cuantos aprobaron
        System.out.println("En total aprobraron: "+vectorDeEstudiante.contarAprobados()+" estudiantes");
        System.out.println();
    
    
    }
    
}
