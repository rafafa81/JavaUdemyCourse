package back;

import java.io.File;
import java.io.IOException;

public interface conection  {
	
	public boolean testConnection(String file);
	
	public Object connect(String file);
	
	public void write(String texto);
	
	public String read();
}
