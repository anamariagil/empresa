/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Empresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int id;
        int contador=0;
        int buscar;
        Empleado[] empleados= new Empleado[10];
        do{
            System.out.println("");
            System.out.println("Bienvenido");
            System.out.println("*****************");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleado");
            System.out.println("3. Mostrar empleados");
            System.out.println("4.Salir \n");
            System.out.println("Digite una opción");
            opcion= entrada.nextInt();
            switch(opcion){
                case 1:
                    empleados[contador]=new Empleado();
                    System.out.println("");
                    System.out.println("Ingrese el id del empleado");
                    empleados[contador].setId(entrada.nextInt());
                    System.out.println("");
                    System.out.println("Ingrese el nombre del empleado");
                    empleados[contador].setNombre(entrada.next());
                    System.out.println("");
                    System.out.println("Ingrese el cargo del empleado");
                    empleados[contador].setCargo(entrada.next());
                    System.out.println("");
                    System.out.println("Ingrese el salario del empleado");
                    empleados[contador].setSalario(entrada.nextInt());
                    System.out.println("");
                    System.out.println("Ingrese el telefono del empleado");
                    empleados[contador].setTelefono(entrada.next());
                    System.out.println("");
                    contador++;
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Ingrese el id del empleado");
                    buscar= entrada.nextInt();
                    for (int i=0; i<contador; i++){
                        if (buscar==empleados[i].getId()){
                            System.out.println("");
                            System.out.println("Su nombre es " +empleados[i].getNombre());
                            System.out.println("Su cargo es " +empleados[i].getCargo());
                            System.out.println("Su salario es " +empleados[i].getSalario());
                            System.out.println("Su telefono es " +empleados[i].getTelefono());
                        }
                    }
                    break;
                case 3:
                    System.out.println("");
                    for (int i=0; i<contador; i++){
                        System.out.println("Empleado " +empleados[i].getId());
                        System.out.println("El nombre es " +empleados[i].getNombre());
                        System.out.println("El cargo es " +empleados[i].getCargo());
                        System.out.println("El salario es " +empleados[i].getSalario());
                        System.out.println("El telefono es " +empleados[i].getTelefono());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opción no válida");
                    break;
            }
        }while(opcion!=4);
        
    }
}
