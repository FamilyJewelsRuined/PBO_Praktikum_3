/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Latihan13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int i = 10, angka;
        System.out.println("Masukan Angka : ");
        angka = scan.nextInt();
        while (i >= angka) {
            System.out.println("\n Belajar Java" + i);
            i--;
        }
    }
}
