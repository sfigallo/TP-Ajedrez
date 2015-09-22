package Capa_de_Entidades;

public class Alfil extends Pieza {
	private static char nombre='a';
	
	public boolean isMovimientoValido (Posicion p){
		boolean resp;
		resp=(Math.abs(this.getPosicion().getNumero() - p.getNumero()) == 
				Math.abs(this.getPosicion().getLetra() - p.getLetra()));
		if(this.getPosicion().equals(p)) resp=false;
		
		return resp;
	}
}
