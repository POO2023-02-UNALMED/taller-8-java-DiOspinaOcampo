package futbol;

public abstract class Futbolista implements Comparable<Futbolista> {
	private String nombre;  
	private int edad; 
	final private String posicion;
	
	public Futbolista() {
		this("Maradona", 30, "delantero");
	}

	public Futbolista(String posicion) {
		this("Yashin", 30, posicion);
	}
	
	public Futbolista(String nombre, int edad, String posicion) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public boolean equals(Futbolista f) {
		if (this == f) {
	        return true;
	    }
	    if (f == null) {
	        return false;
	    }
	    if (this.getClass() != f.getClass()) {
	        return false;
	    }

	    return this.nombre.equals(f.getNombre()) && this.edad == f.getEdad() && this.posicion.equals(f.getPosicion());
	}
	
	@Override
	public String toString() {
		return  "El futbolista "+this.nombre+" tiene "+ this.edad+ ", y juega de "+ this.posicion;
	}
	
	public abstract boolean jugarConLasManos();
	
	// Getters and Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getPosicion() {
		return posicion;
	}
}


