/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugas2 {

    public static void main(String[] args) {

        int nilai;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan angka (1-10): ");
        nilai = scan.nextInt();

        switch (nilai) {
            case 1:
                System.out.println("Satu");
                break;

            case 2:
                System.out.println("Dua");
                break;

            case 3:
                System.out.println("Tiga");
                break;

            case 4:
                System.out.println("Empat");
                break;

            case 5:
                System.out.println("Lima");
                break;

            case 6:
                System.out.println("Enam");
                break;

            case 7:
                System.out.println("Tujuh");
                break;

            case 8:
                System.out.println("Delapan");
                break;

            case 9:
                System.out.println("Sembilan");
                break;

            case 10:
                System.out.println("Sepuluh");
                break;

            default:
                System.out.println("Tidak ada angka tersebut di sistem");
        }
    }
}
