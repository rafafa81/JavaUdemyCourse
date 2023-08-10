package front;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.*;

import back.ConectarArchivo;
import back.FileExtensionException;
import back.Semana;

public class pruebaConection {

	public static void main(String[] args) {
		Collection<String> lineas= new ArrayList<String>();
		lineas.addAll(Arrays.asList(new String[] {"Rafael","Moreno","36","Casado"}));
		Scanner entradaTerminal= new Scanner(System.in);
		System.out.println("Introduce el nombre del archivo :");
		String archivo= entradaTerminal.nextLine();
		ConectarArchivo coneccion=null;
		try {
			coneccion = new ConectarArchivo(archivo);
			if (coneccion.testConnection(archivo)) {
				coneccion.connect(archivo);
				for(String ele:lineas) {
					coneccion.write(ele);
				}
				System.out.println(coneccion.read());
			} else {
				System.out.println("El archivo no existe");
			}
		} catch (FileExtensionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al generar el archivo, debe terminar con .txt");
		} 		
		System.out.println("El contenido ordenado de collection es: ");
		Set<String> tree= new TreeSet();
		tree.addAll(lineas);
		imprimir(tree);
		System.out.println("finalmente"+Semana.LUNES);
		
	}
	public static void imprimir(Collection contenido) {
		contenido.forEach(ele -> {
			System.out.println(ele);
		});
	}

}
