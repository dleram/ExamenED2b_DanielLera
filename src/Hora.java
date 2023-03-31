package examen;

public class Hora {
	
	public static boolean validarHora(int horas, int minutos, int segundos) {
		boolean resultado = true;
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				resultado = false;
			} else if (minutos > 59) {
				resultado = false;
			} else if (segundos > 59) {
				resultado = false;
			}
		} else {
			resultado = false;
		}
		return resultado;
	}
}