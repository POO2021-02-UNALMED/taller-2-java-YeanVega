package test;
public class Auto {
    String modelo;
	int precio;
    Asiento[] asientos;
	String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

	public int cantidadAsientos() {
		int numeroAsientos = 0;
		if (asientos != null) {
			for (Asiento asiento : asientos) {
				if (asiento != null) {
					numeroAsientos++;
				}
			}
		}
		return numeroAsientos;
	}
	String verificarIntegridad() {
		if (asientos[0].registro == registro) {
			if(registro == motor.registro){
                return "Auto original";
		    } 
        }else {
			return "Las piezas no son originales";
		}
	}   
}
