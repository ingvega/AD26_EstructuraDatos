package oup.avance_problema_atencion_clientes;


import java.time.LocalTime;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paveg
 */
public class AtencionClientes {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        LocalTime hora=LocalTime.parse("13:43");
        hora=hora.plusMinutes(3);
        System.out.println(hora);
    }
}

class Cliente implements Comparable<Cliente>{
    String nombre;
    LocalTime horaLlegada;
    int edad;

    public Cliente(String datos) {
        //A-60-08:35
        String[] partes=datos.split("-");
        nombre=partes[0];
        edad=Integer.parseInt(partes[1]);
        horaLlegada=LocalTime.parse(partes[2]);
    }
            
    @Override
    public int compareTo(Cliente o) {
        if(horaLlegada.compareTo(o.horaLlegada)==0)
            return nombre.compareTo(o.nombre);
        else
            return horaLlegada.compareTo(o.horaLlegada);
    }
    
}