package estudiantesenpoo;

/**
 *
 * @author catax
 */
public class Estudiante 
{
    private String nombre;
    private char sexo;
    private float parcial1; //15%
    private float parcial2; //20%
    private float parcial3; //30%
    private float trabajo1; //35%

    //Constructor -> No tiene valor de retrno y se debe llamar igual a la clase
    public Estudiante(String nombre, char sexo, float parcial1, float parcial2, float parcial3, float trabajo1) 
    {
        this.nombre = nombre; //this del atributo
        this.sexo = sexo;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
        this.trabajo1 = trabajo1;
    }
    
    //gets y sets
    //get -> entrar al contenido del atributo y extraer una copia y retornarla
    //set-> entrar al contenido del atributo, y modificarlos
    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public float getParcial1() {
        return parcial1;
    }

    public float getParcial2() {
        return parcial2;
    }

    public float getParcial3() {
        return parcial3;
    }

    public float getTrabajo1() {
        return trabajo1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setParcial1(float parcial1) {
        this.parcial1 = parcial1;
    }

    public void setParcial2(float parcial2) {
        this.parcial2 = parcial2;
    }

    public void setParcial3(float parcial3) {
        this.parcial3 = parcial3;
    }

    public void setTrabajo1(float trabajo1) {
        this.trabajo1 = trabajo1;
    }
    
    public float calcularDefinitiva()
    {
        float notaDef;
        notaDef = parcial1*0.15f+parcial2*0.20f+trabajo1*0.35f+parcial3*0.30f;
        return notaDef;
    }
    
    public String estadoEstudiante()
    {
        float notaDef = calcularDefinitiva();
        String estado = "Repite";
        if (notaDef >= 3.0f)
        {
            estado="Aprueba";
        } 
        else
        {
            if (notaDef >2.0f)
            {
            estado="Habilita";        
            }
        } 
        return estado;
    }
}