public class Alumno
{
 // Estos atributos no tienen valor en este momento.
 // Cada objeto se encargará de darle un valor específico
 // Por lo que se llaman variables de instancia
 String numeroDeCuenta;
 String nombre;
 int semestre;
 public Alumno()
 {
 System.out.println("Creando un objeto");
 }
 public Alumno(String numCuenta, String nom, int sem)
 {
 System.out.println("Creando un objeto");
 numeroDeCuenta = numCuenta;
 nombre = nom;
 semestre = sem;
 }
 public static void main(String args[])
 {
 Alumno alumno1 = new Alumno ("111111111","Juan",3);
 Alumno alumno2 = new Alumno ("222222222","Jorge",4);
 Alumno alumno3 = new Alumno ();
 System.out.println("numero de cuenta:" + alumno1.numeroDeCuenta);
 System.out.println("nombre:" + alumno1.nombre);
 System.out.println("semestre:" + alumno1.semestre);
 System.out.println("----------------------");
 System.out.println("numero de cuenta:" + alumno2.numeroDeCuenta);
 System.out.println("nombre:" + alumno2.nombre);
 System.out.println("semestre:" + alumno2.semestre);

 System.out.println("----------------------");
 System.out.println("numero de cuenta:" + alumno3.numeroDeCuenta);
 System.out.println("nombre:" + alumno3.nombre);
 System.out.println("semestre:" + alumno3.semestre);

 }
}