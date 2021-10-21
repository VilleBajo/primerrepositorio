package principal;

import entidades.Tramo;

public class Principal {

	public static void main(String[] args) {
	
		Tramo tramo1;
		tramo1 = new Tramo();
		
		long idtramo1 = tramo1.getId();
		int puntokminiciotramo1 = tramo1.getPuntoKmInicio();
		int puntokmfintramo1 = tramo1.getPuntoKmFin();
		
		idtramo1 = 101;
		puntokminiciotramo1 = 22;
		puntokmfintramo1 = 27;
		
		tramo1.setId(idtramo1);
		tramo1.setPuntoKmInicio(puntokminiciotramo1);
		tramo1.setPuntoKmFin(puntokmfintramo1);
		
		System.out.println("Escribe lo que quieras");
		System.out.println(idtramo1);
		System.out.println("Lo que me de la gana:\t" + tramo1.getPuntoKmInicio() + idtramo1 + " algo: " + tramo1.getPuntoKmInicio());
		
		

	}

}
