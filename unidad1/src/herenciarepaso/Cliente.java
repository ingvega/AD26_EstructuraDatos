/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciarepaso;

/**
 *
 * @author paveg
 */
public class Cliente extends Persona{
    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void mostrar() {
        System.out.println("nombre=" + getNombre() + "\n fechaNacimiento=" + getFechaNacimiento() + "\n telefono=" + telefono);
    }
    
    
}
