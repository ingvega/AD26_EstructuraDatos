/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciarepaso;

/**
 *
 * @author paveg
 */
public class Empleado extends Persona {
    private float sueldoBruto;

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public void mostrar() {
        System.out.println("nombre=" + getNombre() + "\n fechaNacimiento=" + getFechaNacimiento() + "\n sueldoBruto=" + sueldoBruto);
    }
    
    
}
