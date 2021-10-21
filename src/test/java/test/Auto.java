package test;
public class Auto {
    public String modelo;
	public int precio;
    public Asiento[] asientos;
	public String marca;
    public Motor motor;
    public int registro;
    static int cantidadCreados;

	
	String verificarIntegridad() {
		if (asientos[0].registro == registro) {
			if(registro == motor.registro){
                return "Auto original";
		    } 
        }else {
			return "Las piezas no son originales";
		}
	}

    public int cantidadAsientos() {
		int numeroAsientos = 0;
		if (asientos != null) {
			for (Asiento o : asientos) {
				if (o != null) {
					numeroAsientos++;
				}
			}
		}
		return numeroAsientos;
	}
}
