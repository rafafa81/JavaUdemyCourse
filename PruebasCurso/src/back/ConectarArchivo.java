package back;

import java.io.*;

public class ConectarArchivo implements conection {
	
	private File file=null;
	
	public ConectarArchivo(String fileName) throws FileExtensionException {
		if (!(fileName.substring((fileName.length()-4)).equals(".txt"))) {
			throw new FileExtensionException("El archivo no termina con .txt");
		}
		this.file=new File(fileName);
		try {
			PrintWriter salida= new PrintWriter(this.file);
			salida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("El archivo fue creado");
		}
	}
	
	@Override
	public boolean testConnection(String fileName) {
		File file= new File(fileName);
		return file.exists();
		
	}

	@Override
	public Object connect(String file) {
		this.file = new File(file);
		return null;
	}

	@Override
	public void write(String texto) {
		PrintWriter salida=null;
		try {
			salida = new PrintWriter(new FileWriter(this.file,true));
			salida.println(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			salida.close();
		}
	}

	@Override
	public String read() {
		var temp="";
		try {
			var entrada= new BufferedReader(new FileReader(this.file));
			var lectura=entrada.readLine();
			while(lectura != null) {
				temp=temp+lectura+"\n";
				lectura=entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

}
