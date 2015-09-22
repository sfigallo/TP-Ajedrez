package Capa_de_Entidades;

public class Torre  extends Pieza {
	private static char nombre='t';
	
	public boolean isMovimientoValido (Posicion p){
		boolean resp=false;
		resp=((this.getPosicion().getNumero() == p.getNumero())||
				(this.getPosicion().getLetra() == p.getLetra()));
		if(this.getPosicion().equals(p)) resp=false;
		return resp;
	}
}
