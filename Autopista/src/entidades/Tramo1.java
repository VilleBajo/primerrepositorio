package entidades;

public class Tramo1 extends Tramo {

	protected long id;
	protected int puntoKmInicio;
	protected int puntoKmFin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPuntoKmInicio() {
		return puntoKmInicio;
	}

	public void setPuntoKmInicio(int puntoKmInicio) {
		this.puntoKmInicio = puntoKmInicio;
	}

	public int getPuntoKmFin() {
		return puntoKmFin;
	}

	public void setPuntoKmFin(int puntoKmFin) {
		this.puntoKmFin = puntoKmFin;
	}

	public Tramo1() {

	}

	@Override
	public String toString() {
		return "Tramo1 [id=" + id + ", puntoKmInicio=" + puntoKmInicio + ", puntoKmFin=" + puntoKmFin + "]";
	}

	
	
}
