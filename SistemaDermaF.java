import java.util.Scanner;

public class SistemaDermaF{

    public static String nombrePaciente(){

        Scanner lector = new Scanner(System.in);

        System.out.println("Escribe tu nombre completo: ");
        String nombre = lector.nextLine();

        return nombre;
    }

    public static int menu(String nombre){ //DUDA: dentro del parentesis podria estar String nombre?
        Scanner lector = new Scanner(System.in);

        System.out.println("\n\tBienvenidx " + nombre + " al consultorio virtual de Berna."  +
        "\n\tTe presentamos el menu a continuacion. Escribe el numero: " +
        "\n\t(1) si necesitas obtener tu receta medica" +
        "\n\t(2) si necesitas saber el tiempo faltante de tu tratamiento");
        int numeroMenu = lector.nextInt();

        return numeroMenu;
    }

    public static void eleccionMenu(int numeroMenu){
        Scanner lector = new Scanner(System.in);
        //int seleccionNumero = menu();

        if(numeroMenu == 1){
            System.out.println("\tEl tratamiento consiste en:" +
            "\n\t\tMartiDerm serum en la maniana y noche" + 
            "\n\t\tContorno de ojos Bioderma maniana y noche" + 
            "\n\t\tProtector solar Eucerin oil control. Reaplicar cada 4 horas" + 
            "\n\n\t\tCualquier duda, ponte en contacto al 5512349373");
        }else if(numeroMenu ==2){
            System.out.println("Coloca los dias que llevas de tratamiento: ");
            int diasDeTratamiento = lector.nextInt();

            if(diasDeTratamiento<=31){
                int diasRestantes = 31 - diasDeTratamiento;
                System.out.println("Los dias que te quedan de tratamiento son " + diasRestantes + ", pronto concluiras");
            }else{
                System.out.println("Has concluido tu tratamiento. Te sugerimos que te pongas en contacto con tu derma");   
            }


        }else{
            System.out.println("Parece que hubo un error. Vuelve a colocar el numero.");
        }

    }

    public static void main(String [] args){

        String nombreUsuario = nombrePaciente();
        int menuDerma = menu(nombreUsuario);
        //int numeroMenu = 4;
        eleccionMenu(menuDerma);
        
    }

}