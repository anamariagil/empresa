/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Bienvenido");
            System.out.println("*****************");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4.Salir \n");
            System.out.println("Digite una opción");
            opcion= entrada.nextInt();
        }while(opcion!=4);
    }
}
