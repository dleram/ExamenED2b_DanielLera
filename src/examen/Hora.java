package examen;
/**
 * 
 * @author dam09
 * @version 1.0
 *
 */


public class Hora {
	/**
	 * @param horaValida 
	 * Variable boleana que devolvemos.
	 * @param segundos parametro que representa los segundos
	 * @param minutos parametro que representa los minutos
	 * @param horas parametro que representa los horas
	 */
	public static boolean horaValida;
	public static boolean validarHora(int segundos, int minutos, int horas) {
		/**
		 * Inicializamos la variable 
		 */
		horaValida = true;
		/**
		 * Comprobamos las tres variables que nos pasan para que sean 
		 * mayores de 0
		 */
		
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			/**
			 * comprobamos que horas es menor que 23
			 * comprobamos que minutoa es menor que 59
			 * comprobamos que segundos es menor que 59
			 * 
			 * en caso de que no convewrtimos horaValida a false
			 */
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
			
		/**
		 * Si no son mayores de cero convewrtimos horaValida a false
		 */
		} else {
			horaValida = false;
		}
		
		/**
		 * Devolvemos el resultado
		 */
		return horaValida;
	}
}