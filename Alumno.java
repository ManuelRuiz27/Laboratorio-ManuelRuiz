import java.util.ArrayList;
public class Alumno
{
    private String nombreAl;
    private String claveAl;
    public Alumno(String alumno,String clave)
    {
        nombreAl=alumno;
        claveAl=clave;
    }
    public String nombreDelAlumno()
    {
        String nombre="El nombre del alumno es: "+nombreAl;
        return nombre;
    }
    public String claveDelALumno()
    {
        String clave="La clave del alumno es: "+claveAl;
        return clave;
    }
    public String toString()
    {
        String Aux="Nombre del Alumno: "+nombreAl+"Clave del Alumno; "+claveAl;
        return Aux;
    }
}