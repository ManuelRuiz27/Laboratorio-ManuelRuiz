import java.util.ArrayList;
public class Laboratorio
{
    private ArrayList<Alumno>alumnos;
    private String nombreAl;
    private String clave;
    public Laboratorio()
    {
        alumnos=new ArrayList<Alumno>();
    }
    public void altaDeAlumno(String nombreAl, String clave)
    {
        Alumno nuevoAlumno= new Alumno(nombreAl,clave);
        alumnos.add(nuevoAlumno);
    }
    public void bajaDeAlumno(String nombreDelAlumno)
    {
        String aux=nombreDelAlumno;
        for(int i=0;i<alumnos.size();i++)
        {
            if(aux==nombreDelAlumno)
            {
                alumnos.remove(alumnos.get(i));
            }
        }
    }
    public void muestraLista()
    {
        System.out.println("Lista de alumnos inscritos");
        for(int i=0;i<alumnos.size();i++)
        {
            Alumno al=alumnos.get(i);
            System.out.println(al);
        }
    }
    public String toString()
    {
        String aux="Nombre del Alumno: "+nombreAl+" Clave del Alumno; "+clave+"\n";
        return aux;
    }
}