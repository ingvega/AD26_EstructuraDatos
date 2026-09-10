/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ed_unidad2;

import java.util.Scanner;

/**
 *
 * @author paveg
 */
public class Ayudaaaaa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, m, n;
        a = sc.nextDouble();
        b = sc.nextDouble();
        m = sc.nextDouble();
        n = sc.nextDouble();
        System.out.println(cuantaSeDoblanRecursivo(a, b, m,n));
    }

    public static int cuantaSeDoblanRecursivo(double a, double b, double m, double n) {
        return cuantaSeDoblan(a, b, m, n, 0);
    }

    public static int cuantaSeDoblan(double a, double b, double m, double n, int acc) {
        if (((a <= m) && (b <= n)) || ((b <= m) && (a <= n))) { 
            return acc;
        }
        if (acc == 8) {
            return -1;
        }
        if (a > b) {
             return cuantaSeDoblan(a / 2, b, m, n, ++acc);
        } else {
            return cuantaSeDoblan(a, b/2, m, n, ++acc);
        }
    }
}
