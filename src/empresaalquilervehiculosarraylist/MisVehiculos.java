package empresaalquilervehiculosarraylist;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author salva
 */
public class MisVehiculos {
    
    public static void main(String[] args) {
        //Crear una empresa de alquiler con los datos que tú quieras.
        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive", "www.easydrive.com");
        Scanner entrada = new Scanner(System.in);
        //Se llenarán los arraylist de clientes y vehículos de forma aleatoria usando los métodos pertinentes. 
        easydrive.rellenarArrayClientes();
        easydrive.rellenarArrayCoches();
        //-------------------------------------------------------------------------------------------------

        // Una vez cargados los 25 clientes y 25 vehículos aleatorios, se mostrarán usando la consola.
        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();
        //-------------------------------------------------------------------------------------------------
//El programa solicitará por teclado el nif de un cliente, la matrícula de un vehículo y el número de días que se quiere alquilar.
//
//        System.out.println("Introduce un nif");
//        String nif = entrada.nextLine();
//
//        System.out.println("Introduce una matricula");
//        String matricula = entrada.nextLine();
//
//        System.out.println("Introduce los dias que se va a alquilar el vehiculo");
//        int diasAlquiler = entrada.nextInt();
//
////El sistema registrará, usando el método apropiado, el alquiler anterior.
//        easydrive.alquilarVehiculo(matricula, nif, diasAlquiler);
//
//        System.out.println("---------------------");
//        System.out.println(easydrive.getAlquileres());
//------------------------------------------------------------------------------------------------------------------
//Posteriormente, se ordenarán los clientes y los vehículos usando los métodos apropiados. 
        System.out.println("Listas ordenadas");
        easydrive.ordenarCarteraClientes();
        easydrive.ordenarCatalogoVehiculos();
        
        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();
//------------------------------------------------------------------------------------------------------------------

    }
}
