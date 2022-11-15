import java.util.Random;

public class EjercicioDosF{

    /*En una comunidad que hablan la misma lengua se compone de 30 personas (entre 20-50 anios).
        Te gustaria saber la edad promedio de los hablantes.
        Genera con ciclos WHILE y FOR un programa que me ayude a generar el promedio de edades.
        HINT: Utiliza numeros aleatorios para simular las edades */
    
    public static int numRandom(int max, int min){
        Random numeroAleatorio = new Random();
        int aleatorio = min + numeroAleatorio.nextInt(max-min);
        return aleatorio;
    }

    public static int sumaHablantes(int noHablantes, int max, int min){
        int sumaTotal = 0;


        for(int i = 0; i<noHablantes ; i++){
            int numeroRandom = numRandom(max, min); 
            sumaTotal = sumaTotal + numeroRandom;
        }
        return sumaTotal;
    }

    public static int promedio(int sumaTotal, int hablantes){
        int promedioEdades = sumaTotal/hablantes;
        return promedioEdades;
    }


    public static void main(String [] args){

        int max = 50;
        int min = 30;
        int hablantes = 30;

        //int noAleatorio = numRandom(max, min);
        int sumaEdadHablantes = sumaHablantes(hablantes, max, min);
        System.out.println("Suma de edades: " + sumaEdadHablantes);
        int promEdades = promedio(sumaEdadHablantes, hablantes);
        System.out.println("Promedio de edades: " + promEdades);


    }
}