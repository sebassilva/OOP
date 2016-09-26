//javac -d /Users/sebastian/Documents/Ingeniería/3er\ Semestre/OOP/practica_5/bin  -cp $CLASSPATH:/Users/sebastian/Documents/Ingeniería/3er\ Semestre/OOP/practica_5/bin ClaseHijaEnDiferentePaquete.java
//java -cp $CLASSPATH:/Users/sebastian/Documents/Ingeniería/3er\ Semestre/OOP/practica_5/bin  mx.unam.fi.poo.paq02.ClaseHijaEnDiferentePaquete

package mx.unam.fi.poo.paq02;
import mx.unam.fi.poo.paq01.ClaseInicial;
public class ClaseHijaEnDiferentePaquete extends ClaseInicial
{
public static void main(String arg[])
{
 ClaseHijaEnDiferentePaquete referencia = new ClaseHijaEnDiferentePaquete();
 System.out.println("atributo public a = " + referencia.a);
 referencia.metodoPublic();
 System.out.println("atributo protected b = " + referencia.b);
 referencia.metodoProtected();
 //System.out.println("atributo sin modificador c = " + referencia.c);
 //referencia.metodo();
 // System.out.println("atributo private d = " + referencia.d);
 // referencia.metodoPrivate();
}
}