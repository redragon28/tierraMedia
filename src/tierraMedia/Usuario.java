package tierraMedia;

public class Usuario {
	private String Nombre;
	private String TipoAtraccionPreferida;
	private double TiempoDisponible;
	private int Presupuesto;
	
	public Usuario(String Nombre, String TipoAtraccionPreferida, double TiempoDisponible, int Presupuesto) {
		setNombre(Nombre);
		setTipoAtraccionPreferida(TipoAtraccionPreferida);
		setTiempoDisponible(TiempoDisponible);
		setPresupuesto(Presupuesto);
	}
	
	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}
	
	public void setTipoAtraccionPreferida(String TipoAtraccionPreferida) {
		this.TipoAtraccionPreferida = TipoAtraccionPreferida;
	}
	public void setTiempoDisponible(double TiempoDisponible) {
		this.TiempoDisponible = TiempoDisponible;
	}
	public void setPresupuesto(int Presupuesto) {
		this.Presupuesto = Presupuesto;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public String getTipoAtraccionPreferida() {
		return TipoAtraccionPreferida;
	}
	public double getTiempoDisponible() {
		return TiempoDisponible;
	}
	public int getPresupuesto() {
		return Presupuesto;
	}
	
	
	
}
