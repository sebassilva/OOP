class Alumno{
  String nombre;
  int edad;
  public static void main(String[] args) {
    Alumno alumno1 = new Alumno();
    alumno1.edad = 234;
    alumno1.nombre = "Juanito perez";
    System.out.println("El nombre del alumno es: " + alumno1.nombre);
  }
}
