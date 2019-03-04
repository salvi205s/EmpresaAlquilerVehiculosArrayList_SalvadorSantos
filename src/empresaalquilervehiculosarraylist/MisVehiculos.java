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
      
        //Se llenarán los arraylist de clientes y vehículos de forma aleatoria usando los métodos pertinentes. 
        easydrive.rellenarArrayClientes();
        easydrive.rellenarArrayCoches();
        //-------------------------------------------------------------------------------------------------

       // Una vez cargados los 25 clientes y 25 vehículos aleatorios, se mostrarán usando la consola.
        easydrive.imprimirClientes();
        easydrive.imprimirVehiculos();
        //-------------------------------------------------------------------------------------------------

    }
}
