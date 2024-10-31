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

public class Latihan5 {

    public static void main(String[] args) {
        double nilai = 82.0;
        if (nilai >= 90) {
            System.out.println("Luar biasa!");
        } else if ((nilai < 90) && (nilai >= 80)) {
            System.out.println("Kerja bagus!");
        } else if ((nilai < 80) && (nilai >= 60)) {
            System.out.println("Belajar lebih giat lagi!");
        } else {
            System.out.println("Maaf, Anda gagal.");
        }
    }
}
