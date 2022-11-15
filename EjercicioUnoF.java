
public class EjercicioUnoF{

    public static int multiplicacion(int i){
        int multipContenedor = i * 2;
        return multipContenedor;
    }

    public static int suma(int multipContenedor, int sumaContenedor){
        sumaContenedor = sumaContenedor + multipContenedor;
        return sumaContenedor;
    }


    public static int hazCiclo(int repeticionesMaxima){
        int sumaDeContenedor = 0;
        
        for(int i=0; i<=repeticionesMaxima; i++){

            int multiplicacionContenedor = multiplicacion(i);
            sumaDeContenedor = suma(multiplicacionContenedor, sumaDeContenedor);

        }

        return sumaDeContenedor;
    }


    public static void main(String [] args){

        int valorLimite = 6;
        int resultadoSumaCiclo =  hazCiclo(valorLimite);

        /*for(int i=0; i<=valorLimite; i++){

            int multiplicacionContenedor = multiplicacion(i);
            sumaDeContenedor = suma(multiplicacionContenedor, sumaDeContenedor);

        }*/
            System.out.println("Total de la sumatoria (7 veces): " + resultadoSumaCiclo);

    }
}