package funciones;

import java.util.Scanner;

public class TiendaFrutasVerduras {


    /**
     * Funcion que muestra el menu de verduras. Permite al usuario elegir la verdura y la cantidad 
     * de dicha verdura
     * @return Un valor entero que representa el total a pagar
     */
    static public int menuVerduras(){
        Scanner lector = new Scanner(System.in);

        String menu = "\n\t(1)Calabaza \t$5"+ "\n\t(2)Brocoli \t$8"+ "\n\t(3)Jitomate \t$6" + "\n\t(4)Cebolla \t$7";
        System.out.println(menu);
        System.out.println("Selecciona que verdura quieres: ");
        int seleccionVerdura = lector.nextInt();


        String nombreVerduraSeleccionada = getNombreVerdura(seleccionVerdura);

        System.out.println("Ingresa cantidad de "+nombreVerduraSeleccionada+": ");
        int cantidadVerdura = lector.nextInt();

        int precioVerduraSeleccionada = getPrecioVerdura(seleccionVerdura);
        System.out.println("Precio de la " + nombreVerduraSeleccionada + ": $" + precioVerduraSeleccionada);

        int totalAPagar = cantidadVerdura * precioVerduraSeleccionada;

        System.out.println("Total a pagar: $"+totalAPagar);

    
        return totalAPagar;
    }

    /**
     * Funcion que me regrese el precio de la verdura
     * @param seleccionVerdura eleccion que hizo el usario en el menu
     * @return Un entero que representa el precio de la verdura seleccionada
     */
    static public int getPrecioVerdura(int seleccionVerdura){
        int precioVerdura = 0;

        switch(seleccionVerdura){
            case 1: precioVerdura = 5;break;
            case 2: precioVerdura = 8; break;
            case 3: precioVerdura = 6; break;
            case 4: precioVerdura = 7; break;
            default: precioVerdura = -1; 
        }

        return precioVerdura;
    }

    /**
     * Funcion que recupera el nombre de una verdura 
     * @param seleccionVerdura eleccion que hizo el usario en el menu
     * @return Un string que representa el nombre de la vewrdura seleccionada
     */
    static public String getNombreVerdura(int seleccionVerdura){
        String nombre = "";
        if(seleccionVerdura == 1)
            nombre = "calabaza";
        else if(seleccionVerdura == 2)
            nombre = "brocoli";
        else if(seleccionVerdura == 3)
            nombre = "jitomate";
        else if(seleccionVerdura == 4)
            nombre = "cebolla";
        return nombre;
    }


    static public int menuFrutas(){
        String menu = "\t\n(1) Sandia \t$18, \t\n(2) Melon \t$22, \t\n(3) Kiwi \t$11";
        System.out.println(menu);
        Scanner lector = new Scanner(System.in);
        System.out.println("Elige el numero de la fruta que quieres: ");
        int eleccionFruta = lector.nextInt();

        String nombreDeFruta = nombreFruta(eleccionFruta);

        System.out.println("Ingresa la cantidad de " + nombreDeFruta + " que deseas:");
        int cantidadFruta = lector.nextInt();

        int precioDeFruta = precioFruta(eleccionFruta);
        System.out.println("Precio de la " + nombreDeFruta + ": $" + precioDeFruta);

        int pagoFruta = precioDeFruta * cantidadFruta;
        System.out.println("Total a pagar: $" + pagoFruta);

        return pagoFruta;
    }

    static public int precioFruta(int eleccionFruta){
        int precioFruta = 0;

        if(eleccionFruta == 1){
            precioFruta = 18;
        }else if(eleccionFruta == 2){
            precioFruta = 22;
        }else if(eleccionFruta == 3){
            precioFruta = 11;
        }
        return precioFruta;
    }        

    static public String nombreFruta(int eleccionFruta){
        String nombreFr = "";

        if(eleccionFruta == 1){
            nombreFr = "Sandia";
        }else if(eleccionFruta == 2){
            nombreFr = "Melon";
        }else if(eleccionFruta == 3){
            nombreFr = "Kiwi";
        }
        return nombreFr;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Selecciona el menu de compra");
        System.out.println("(1) Menu de verduras \n(2) Menu de frutas");
        int eleccionDeMenu = lector.nextInt();
        int totalPago = 0;
        int sumaProductos = 0;

        while(eleccionDeMenu == 1 || eleccionDeMenu == 2){

        if(eleccionDeMenu == 1){
            totalPago = menuVerduras();
        }else if(eleccionDeMenu == 2){
            totalPago = menuFrutas();
        }
        sumaProductos = totalPago + sumaProductos;

        System.out.println("Selecciona el numero para continuar:\n\t(1) Menu verduras \n\t(2) Menu frutas \n\t(3) Finalizar compra");
        eleccionDeMenu = lector.nextInt();
        }

        System.out.println("Tu cuenta es de: $" + sumaProductos);
        //Proceso de pago del cliente
        System.out.println("Ingresa saldo: ");
        int saldoUsuario = lector.nextInt();

        while(saldoUsuario < sumaProductos){
        System.out.println("Saldo insuficiente. Ingresa una cantidad mayor: ");
        saldoUsuario = lector.nextInt();
        }

        int cambio = saldoUsuario - sumaProductos;

        System.out.println("Gracias por tu compra!!! :D \nTu cambio es de $"+cambio);

    }
    
}
