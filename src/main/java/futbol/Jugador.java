package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	@Override
	public int compareTo(Object f) {
		if(f instanceof Jugador) {
			Jugador otroJugador = (Jugador) f;
			return Math.abs(this.getEdad() - otroJugador.getEdad());
		}
		return this.getEdad();
	}
	
	@Override
	public String toString() {
		return String.format("%s con el dorsal %d. Ha marcado %d", super.toString(), this.dorsal, this.golesMarcados);
	}
	
	@Override
	public boolean jugarConLasManos() {
		return false;
	}
}
