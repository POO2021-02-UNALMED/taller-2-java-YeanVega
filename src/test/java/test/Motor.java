package test;
public class Motor {
    public String tipo;
	public int numeroCilindros;
	public int registro;

	void cambiarRegistro(int registro){
		this.registro = registro;
	}

	void asignarTipo(String tipo){
		if (tipo.equals("gasolina")){
			this.tipo = tipo;
		}else if(tipo.equals("electrico")){
			this.tipo = tipo;
		}
	}
}
