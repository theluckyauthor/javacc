package uniandes.teolen.parserJavaCC.parserProyecto;

import java.util.ArrayList;

public class Function 
{
	private String nombre;
	
	private ArrayList<String> parametros;
	
	public Function(String nombre)
	{
		this.nombre = nombre;
		
		setParametros(new ArrayList<String>());
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public ArrayList<String> getParametros() {
		return parametros;
	}

	public void setParametros(ArrayList<String> parametros) {
		this.parametros = parametros;
	}
}
