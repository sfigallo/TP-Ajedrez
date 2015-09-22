package Capa_de_Entidades;

public class Partida {
	private Pieza[] piezas= new Pieza[32];
	private int idPartida;
	private Jugador j1;
	private Jugador j2;
	private char turno;
	
	public void iniciarPartida(){
		//Se debe hacer conexion a BD, traer todas las piezas, rellenar el array piezas
		//darle sus respectivas posiciones, y setear el turno en 'b'
		
	}

	public Pieza[] getPiezas() {
		return piezas;
	}

	public void setPiezas(Pieza[] piezas) {
		this.piezas = piezas;
	}

	public int getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}

	public Jugador getJ1() {
		return j1;
	}

	public void setJ1(Jugador j1) {
		this.j1 = j1;
	}

	public Jugador getJ2() {
		return j2;
	}

	public void setJ2(Jugador j2) {
		this.j2 = j2;
	}

	public char getTurno() {
		return turno;
	}

	public void setTurno(char turno) {
		this.turno = turno;
	}
	
	
	

}
