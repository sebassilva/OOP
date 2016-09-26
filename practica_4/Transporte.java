public class Transporte{
	private int numeroDePersonas;

	public Transporte(){

	}


	public Transporte(int numeroDePersonas){
		if (numeroDePersonas <= 0){
			this.numeroDePersonas = 0;
		}else{
			this.numeroDePersonas = numeroDePersonas;
		}
	}

	public void transportar(){
		if (this.numeroDePersonas > 0){
			System.out.println("Trasnportando " + this.numeroDePersonas + "personas.");
		}else{
			System.out.println("Trasnporte vacío.");
		}
	}

	public void setNumeroDePersonas(int numeroDePersonas){
		this.numeroDePersonas = numeroDePersonas;
	}
	public int getNumeroDePersonas(){
		return this.numeroDePersonas;
	}


	public static void main(String[] args){
		 Transporte t1 = new Transporte();
		 t1.transportar();
		 Transporte t2 = new Transporte(45);
		 t2.transportar();
	}
}