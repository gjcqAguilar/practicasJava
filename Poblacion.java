package funciones;

import java.util.Random;

public class Poblacion {

    
    /**
     * 
     * @param a numero a sumar
     * @param b numero a sumar
     * @return un numero resultado de la suma de a mas b
     */
    static public int sumar(int a, int b){
        int resultadoSuma = a + b;
        return resultadoSuma;
    }


    /**
     * 
     * @param a numero dentro de la casita
     * @param b numero fuera de la casita
     * @return numero resultado de divir a entre b
     */
    static public int divide(int a, int b){
        int resultadoDivision = a/b;
        return resultadoDivision;
    }

    /**
     * 
     * @param resultadoSuma es el resultado de la suma de edades
     * @param promedio es el resultado del promedio
     */
    static public void muestraResultadoFinal(int resultadoSuma, int promedio){
        System.out.println("Sumatoria de las edades: " + resultadoSuma);
        System.out.println("Promedio: " + promedio);
    }


    /**
     * 
     * @param valMin valor inicial para generar mi numero aleatorio
     * @param valMax val maximo que puede tener mi numero aleatorio
     * @return numero que se encuentra entre el valor minimo y maximo dado
     */
    static public int generaNumeroRandom(int valMin, int valMax){
        Random numAleatorio = new Random();
        int numRandom = valMin + numAleatorio.nextInt(valMax - valMin);
        return numRandom;
    }



    /**
     * 
     * 
     * @param noHablantes el numero de hablantes
     * @param edadMinima el minimo de edad permitido
     * @param edadMaxima el maximo de edad permitido
     * @return La suma total de la edad de los hablantes
     */
    static public int sumaEdadHablantes(int noHablantes,int edadMinima,int edadMaxima){
        int sumatoriaEdad = 0;

        for(int i = 0; i<noHablantes; i++){
            int edadDeHablante = generaNumeroRandom(edadMinima, edadMaxima);
            sumatoriaEdad = sumar(sumatoriaEdad, edadDeHablante);
        }

        return sumatoriaEdad;
    }
    
    
/*En una comunidad que hablan la misma lengua se compone de 30 personas (entre 20-50 anios).
    Te gustaria saber la edad promedio de los hablantes.
    Genera con ciclos WHILE y FOR un programa que me ayude a generar el promedio de edades.
    HINT: Utiliza numeros aleatorios para simular las edades */

    public static void main(String[] args) {

        //CICLO FOR
        System.out.println("\nCICLO FOR");
        
        int edadMinima = 25;
        int edadMaxima = 50;
        int noHablantes = 30;

        int resultadoSumaEdades = sumaEdadHablantes(noHablantes, edadMinima, edadMaxima);
        int promEdad = divide(resultadoSumaEdades, noHablantes);
        muestraResultadoFinal(resultadoSumaEdades, promEdad);
    }
}
