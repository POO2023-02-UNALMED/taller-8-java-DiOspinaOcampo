package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero() {
		super("Portero");
		this.golesRecibidos = 0;
		this.dorsal = 1;
	}

	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	@Override
	public int compareTo(Object f) {
		if(f instanceof Portero) {
			Portero otroPortero = (Portero) f;
			return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
		}
		return Math.abs(this.golesRecibidos);
	}

	@Override
	public String toString() {
		return String.format("%s con el dorsal %d. Le han marcado %d", super.toString(), this.dorsal, this.golesRecibidos);
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}

}
