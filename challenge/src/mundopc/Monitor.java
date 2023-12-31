package mundopc;

public class Monitor {
	private int idMonitor;
	private String marca;
	private double tamano;
	private static int contadorMonitores;
	
	private Monitor() {
		this.idMonitor = ++Monitor.contadorMonitores;
	}
	public Monitor(String marca, Double tamano) {
		this();
		this.marca=marca;
		this.tamano=tamano;
	}
	
	public int getIdMonitor() {
		return idMonitor;
	}
	public void setIdMonitor(int idMonitor) {
		this.idMonitor = idMonitor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getTamano() {
		return tamano;
	}
	public void setTamano(double tamano) {
		this.tamano = tamano;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Monitor [idMonitor=");
		builder.append(idMonitor);
		builder.append(", marca=");
		builder.append(marca);
		builder.append(", tamano=");
		builder.append(tamano);
		builder.append("]");
		return builder.toString();
	}
	
	
}
