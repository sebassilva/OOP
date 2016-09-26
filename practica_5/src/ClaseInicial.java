package mx.unam.fi.poo.paq01;
public class ClaseInicial{
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d= 40;
	public void metodoPublic()
	{
		System.out.println("En el metodo public");
	}
	protected void metodoProtected()
	{
		System.out.println("En el metodo protected");
	}
	void metodo()
	{
		System.out.println("En el metodo sin modificador");
	}
	private void metodoPrivate()
	{
		System.out.println("En el metodo private");
	}
	public static void main(String arg[]){
		ClaseInicial ref = new ClaseInicial();
		System.out.println("atributo public a = " + ref.a);
		ref.metodoPublic();
		System.out.println("atributo protected b = " + ref.b);
		ref.metodoProtected();
		System.out.println("atributo sin modificador c = " + ref.c);
		ref.metodo();
		System.out.println("atributo private d = " + ref.d);
		ref.metodoPrivate();
	}
}