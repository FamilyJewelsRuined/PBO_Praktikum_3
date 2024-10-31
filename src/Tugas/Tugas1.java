/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian pertama: ");
        double nilai1 = input.nextDouble();

        System.out.print("Masukkan nilai ujian kedua: ");
        double nilai2 = input.nextDouble();

        System.out.print("Masukkan nilai ujian ketiga: ");
        double nilai3 = input.nextDouble();

        double rataRata = (nilai1 + nilai2 + nilai3) / 3;

        System.out.println("Rata-rata nilai: " + rataRata);

        if (rataRata >= 80) {
            System.out.println("Lulus");
        } else {
            System.out.println("Belum Lulus");
        }
    }
}
