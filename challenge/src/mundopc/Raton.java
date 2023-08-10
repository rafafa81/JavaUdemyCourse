package mundopc;

public class Raton extends DispositivoEntrada{
	private int idRaton;
	private static int contadorRatones;
	
	public Raton (String tipoEntrada, String marca) {
		super(tipoEntrada,marca);
		this.idRaton=++Raton.contadorRatones;
	}

	public int getIdRaton() {
		return idRaton;
	}

	public void setIdRaton(int idRaton) {
		this.idRaton = idRaton;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Raton [idRaton=");
		builder.append(idRaton);
		builder.append("]");
		return builder.toString();
	}
	
}
