package funciones;

import java.util.Random;

public class CarreraCaballos {

    static final int VALOR_MAX_DADO = 3;
    static final int VALOR_MIN_DADO = 0;


    public static int tiraDado(){
        Random numRandom = new Random ();
        int lanzamiento = VALOR_MIN_DADO + numRandom.nextInt(VALOR_MAX_DADO - VALOR_MIN_DADO);
        return lanzamiento;
    }

    
    public static void imprimeTableroDeCaballo(int casillaActualCaballo, int casillasTotales){

        String tableroActual= "";

        for(int i= 0; i < casillasTotales; i++){
            
            if(i == casillaActualCaballo-1){
                tableroActual = tableroActual + "|C|";    
            }else{
                tableroActual += "| |"; //= tableroActual + "| |"; 
            }   
        }

        tableroActual = tableroActual + "META";
        System.out.println(tableroActual);

    }

    public static void main(String[] args) {
        
        int avanceCaballo1 = 0;
        int casillasDeTablero = 20;

        while(avanceCaballo1 <= casillasDeTablero){
            
            int valorDado  = tiraDado();
            System.out.println("El caballo esta en la casilla: "+ avanceCaballo1);
            System.out.println("El caballo avanza "+ valorDado + " casillas");
            avanceCaballo1 = avanceCaballo1 + valorDado;

            imprimeTableroDeCaballo(avanceCaballo1, casillasDeTablero);
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n***********************************************************");
        }



    }
    
}
