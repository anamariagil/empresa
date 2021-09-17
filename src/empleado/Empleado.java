/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author 503
 */
public class Empleado {
    public int id;
    public String nombre;
    public String cargo;
    private int salario;
    public String telefono;
    public String direccion;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String cargo, int salario, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public int calcularSalario(){
        return(0);
    }
}
