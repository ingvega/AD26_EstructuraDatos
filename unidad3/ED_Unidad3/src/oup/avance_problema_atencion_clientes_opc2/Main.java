/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oup.avance_problema_atencion_clientes_opc2;

/**
 *
 * @author paveg
 */
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        String inicio = lector.next();
        
      
        String[] hIni = inicio.split(":");
        int tiempoActual = Integer.parseInt(hIni[0]) * 60 + Integer.parseInt(hIni[1]);

        PriorityQueue<Persona> mayores = new PriorityQueue<>();
        PriorityQueue<Persona> comunes = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            String dato = lector.next(); 
            String[] partes = dato.split("-");
            
            String nombre = partes[0];
            int edad = Integer.parseInt(partes[1]);
            
            String[] horaMin = partes[2].split(":");
            int llegadaMin = Integer.parseInt(horaMin[0]) * 60 + Integer.parseInt(horaMin[1]);

            Persona p = new Persona(nombre, edad, llegadaMin);

            if (edad >= 50) {
                mayores.add(p);
            } else {
                comunes.add(p);
            }
        }

        int atendidosMayores = 0;
        int atendidosComunes = 0;

        while (!mayores.isEmpty() || !comunes.isEmpty()) {

            Persona persona = null;

          
            if (!mayores.isEmpty() && mayores.peek().horaLlegada <= tiempoActual && atendidosMayores < 3) {
                persona = mayores.poll();
                atendidosMayores++;
            } 
          
            else if (!comunes.isEmpty() && comunes.peek().horaLlegada <= tiempoActual && atendidosComunes < 2) {
                persona = comunes.poll();
                atendidosComunes++;
            } 
          
            else if (!mayores.isEmpty() && mayores.peek().horaLlegada <= tiempoActual) {
                persona = mayores.poll();
                atendidosMayores++;
            } else if (!comunes.isEmpty() && comunes.peek().horaLlegada <= tiempoActual) {
                persona = comunes.poll();
                atendidosComunes++;
            } 
           
            else {
                tiempoActual++;
                continue;
            }

         
            int h = tiempoActual / 60;
            int m = tiempoActual % 60;
            System.out.printf("%s %02d:%02d%n", persona.nombre, h, m);

           
            tiempoActual++;

            
            if (atendidosMayores == 3 && atendidosComunes == 2) {
                atendidosMayores = 0;
                atendidosComunes = 0;
            }
        }
    }

  
    static class Persona implements Comparable<Persona> {
        String nombre;
        int edad;
        int horaLlegada; // Minutos totales

        public Persona(String nombre, int edad, int horaLlegada) {
            this.nombre = nombre;
            this.edad = edad;
            this.horaLlegada = horaLlegada;
        }

        @Override
        public int compareTo(Persona otra) {
            if (this.horaLlegada - otra.horaLlegada==0)
                return this.nombre.compareTo(otra.nombre)*-1;
            else
                return this.horaLlegada - otra.horaLlegada;
        }
    }
}
