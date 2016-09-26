public class Auto extends TransporteTerrestre{
	public static void main(String args[]){
		Auto a = new Auto();
		a.transportar();
	}
	public void transportar(){
		super.transportar();
		System.out.println("Transportando por auto.");
	}
}