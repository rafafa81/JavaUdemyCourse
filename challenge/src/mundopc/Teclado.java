package mundopc;

public class Teclado extends DispositivoEntrada{
	private int idTeclado;
	private static int contadorTeclados;
	
	public Teclado(String tipoEntrada,String marca) {
		super(tipoEntrada,marca);
		this.idTeclado=++Teclado.contadorTeclados;
	}

	public int getIdTeclado() {
		return idTeclado;
	}

	public void setIdTeclado(int idTeclado) {
		this.idTeclado = idTeclado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teclado [idTeclado=");
		builder.append(idTeclado);
		builder.append("]");
		return builder.toString();
	}
	
}
