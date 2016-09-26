//javac -cp $CLASSPATH:/Users/sebastian/Documents/Ingeniería/3er\ Semestre/OOP/practica_5/bin ClaseNoHijaEnMismoPaquete.java
//java -cp $CLASSPATH:/Users/sebastian/Documents/Ingeniería/3er\ Semestre/OOP/practica_5/bin  mx.unam.fi.poo.paq01.ClaseHijaEnMismoPaquete
package mx.unam.fi.poo.paq01;
public class ClaseNoHijaEnMismoPaquete{
	public static void main(String arg[]){
		ClaseInicial referencia = new ClaseInicial();
		System.out.println("atributo public a = " + referencia.a);
		referencia.metodoPublic();
		System.out.println("atributo protected b = " + referencia.b);
		referencia.metodoProtected();
		System.out.println("atributo sin modificador c = " + referencia.c);
		referencia.metodo();
		// System.out.println("atributo private d = " + referencia.d);
		// referencia.metodoPrivate();
	}
}