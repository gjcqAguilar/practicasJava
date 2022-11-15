import java.util.Random;
import java.util.Scanner;

public class AdivinaNumeroF{
    /*EJERCICIO
    Desarrollar un juego llamado "Adivina el numero que acabo de generar entre el 1 y el 100"
    El juego consiste en que la computadora genera un numero de manera aleatoria entre 1 y 100
    El usuario debe escribir el numero que cree que genero la computadora y esta le dira si
    es correcto, es un numero menor o es un numero mayor. El juego termina hasta que el usuario
    adivina el numero aleatorio. 
    */

    public static int  noRandom(int max, int min){
        Random noRandom = new Random();
        int random = min + noRandom.nextInt(max-min);
        return random;
    }


    public static int respuestaUsuario(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Coloca un numero aleatorio entre el 1 y 100: ");
        int respuesta = lector.nextInt();
        return respuesta;
    }


    public static String muestraIntentos(int noRandom, int respuestaUsuario){
        Scanner lector = new Scanner(System.in);
        while(respuestaUsuario != noRandom){
            if(respuestaUsuario > 100 || respuestaUsuario < 1){
                System.out.println("El numero debe de ser entre 1 y 100. Ingresa de nuevo: ");
                respuestaUsuario = lector.nextInt();
            }
            else{
                String rangoNumero = rangos(noRandom, respuestaUsuario);
            }
            respuestaUsuario = lector.nextInt();
        }
        System.out.println("Acertaste!! El numero aleatorio es " + respuestaUsuario); 
        return "";
    }


    public static String rangos(int noRandom, int respuestaUsuario){
        if(respuestaUsuario < noRandom){
            System.out.println("El numero debe ser mayor de " + respuestaUsuario + " .Colocalo de nuevo: ");
            }
        else if(respuestaUsuario > noRandom){
            System.out.println("El numero debe ser menor de " + respuestaUsuario + " .Colocalo de nuevo: ");
        }
        return "";
    }


    public static void main(String [] args){

        System.out.println("\t\nADIVINA EL NUMERO! \nEl juego consiste en que debes adivinar el numero aleatorio del 1 al 100" +
        "\nDebes escribir un numero y te daremos pistas si el numero es mayor o menor." + 
        "\nEl juego termina hasta que adivines el numero aleatorio.");

        int maximo = 100;
        int minimo = 1;

        int numeroRandom = noRandom(maximo, minimo);
        //System.out.println("Numero Random: " + numeroRandom);

        int respuesta = respuestaUsuario();
        String intentos = muestraIntentos(numeroRandom, respuesta);

    }
}