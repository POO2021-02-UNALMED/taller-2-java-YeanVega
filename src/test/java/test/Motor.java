package test;
public class Motor {
    String tipo;
	int numeroCilindros;
	int registro;

	void cambiarRegistro(int registro){
		this.registro = registro;
	}

	void asignarTipo(String tipo){
		if (tipo.equals("gasolina")){
			if(tipo.equals("electrico")){
				this.tipo = tipo;
			}
		}
	}
}
