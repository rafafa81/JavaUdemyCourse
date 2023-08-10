package mundopc;

public class Orden {
	private int idOrden;
	private Computadora[] computadoras;
	private static int contadorOrdenes;
	public static final int MAX_COMPUTADORAS=10;
	
	public Orden() {
		this.idOrden=++Orden.contadorOrdenes;
		computadoras= new Computadora[MAX_COMPUTADORAS];
	}
	public void agregarComputadora(Computadora computadora) {
		this.computadoras[computadora.getIdComputadora()-1]=computadora;
	}
	public void mostrarOrden() {
		System.out.println("Hola mundo");
	}
}
