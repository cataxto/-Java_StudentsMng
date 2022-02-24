package estudiantesenpoo;

public class ArregloEstudiantes 
{
    //Atributos
    private int cantReservada, cantReal, pos; //va a haber un vector estudiante   
    private Estudiante[] vecEstudiantes; 
    //Declarando un campo VecEstudiante que es 
    //un arreglo que en cada posicion guarda referencia a obj Estudiante
    
    //Metodos
    //Constructor
    public ArregloEstudiantes(int pCantRes) //Constructor inicializar las vbles
    {   //No van con el this porque los parametros del constructor se llaman diferente a los atributos
        
        cantReservada = pCantRes; //cuantas posici a reservar en el vector, llega desde el Main al instanciar 
                                  //o crear obj de clase arregloEst
        pos=-1;
        cantReal=-1; 
        //es la posic en el areglo, va a incrementar, en la primera incrementara a cero
        //cuantos objetos tiene guardado el arreglo en un momento determinado
        
        vecEstudiantes = new Estudiante[cantReservada];  //Ahora si crea el arreglo vecEstudiante
        //Creando un arreglo fisicamente un area en memoria para un vector , 
        //de una cantidad de posiciones predeterminada predeterminada 
        //Crea arreglo vacio de Obj Estudiante
    }   
    
    
    public float getNotaDef()
    {
        return vecEstudiantes[0].calcularDefinitiva();
    }
    
    public void ingresarEstudiante(String nombre, char sexo, float parcial1, float parcial2, float parcial3, float trabajo1)
    {
        //Aqui instanciamos clase Estudiante, creamos obj Estudiante
        Estudiante estActual = new Estudiante(nombre, sexo, parcial1, parcial2, parcial3, trabajo1 );
        
        //El obj creado en la linea anterior se lleva a una posicion del arreglo, se lleva la direccion de memoria donde se creo el obj en la memoria
        vecEstudiantes[++cantReal] = estActual;

    }
    
    public Estudiante regresarObjetoEstudiante() //El metodo retornara objeto de tipo estudiantes y el listado se mostrar en main
    {
        ++pos;
        if(pos<cantReal)
        {
            return vecEstudiantes[pos]; //retorna el obj en esa posicion
        }else
        {
            //pos=-1; inicializa para una nueva posicion
            return null; //me pasaria de la ultima posicion del areglo, entonces retorne null
        }
    }
    
    public int contarAprobados()
    {
        int contAprob = 0, i;
        float notaDef;
        for ( i = 0; i <= cantReal; i++) 
        {
            notaDef=vecEstudiantes[i].calcularDefinitiva();
            if (notaDef>=3.0f) 
            {
                contAprob++; //tambien puede ser ++contAprob
            }
        }
        return contAprob;
    }
    
            
}
