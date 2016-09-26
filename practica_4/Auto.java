/*
*Auto.java
*/
public class Auto extends Transporte{
	private String marca;
	private String modelo;
	private int año;


	public Auto(){}
	public Auto(String marca, String modelo, int año, int numeroDePersonas){
		super(numeroDePersonas);
		this.marca = marca; 
		this.modelo = modelo;
		this.año = año; 


	}

	public void transportar(){
		if (getNumeroDePersonas() > 0){
			System.out.println(this.marca + ", " + this.modelo + ", " + this.año + ", Trasnportando " + getNumeroDePersonas() + " personas.");
		}else{
			System.out.println("Auto	 vacío.");
		}
	}


	 public static void main(String arg[]){
		 Auto a1 = new Auto();
		 a1.transportar();
		 Auto a2 = new Auto("ford","mustang",2016,5);
		 a2.transportar();
	 }


}